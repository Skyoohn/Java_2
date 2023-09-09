package edu.global.ex.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.global.ex.security.CustomUserDetailsService;
import lombok.extern.slf4j.Slf4j;

@Configuration // @component + 설정
@EnableWebSecurity // 스프링 시큐리티 필터가 스프린 필터체인데 등록됨.
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
		web.ignoring().antMatchers("/css/**", "/js/**", "/images/**", "/lib/**","/fonts/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("USER").and().withUser("admin")
//				.password("{noop}admin").roles("ADMIN");

		auth.userDetailsService(customUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 우선 CSRF설정을 해제한다.
		// 초기 개발시만 해주는게 좋다.
		http.csrf().disable();
		

		// 시큐리티란? = 인증과 권한
		http.authorizeRequests().antMatchers("/user/**").hasAnyRole("USER").antMatchers("/admin/**").hasAnyRole("ADMIN")
				.antMatchers("/**").permitAll();

		http.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/") // 로그인 성공 후 공통 URL
			.successHandler((request, response, authentication) -> {
            // 권한에 따른 개별 URL 처리

			List<String> authList=new ArrayList<>();
			for(GrantedAuthority auth: authentication.getAuthorities()) {
				authList.add(auth.toString());
			}
			
			if(authList.contains("ROLE_ADMIN")) {
				response.sendRedirect("/admin/admin");
			} else {
				response.sendRedirect("/");
			}

        });// loginPage()는 말 그대로 로그인 할 페이지 url
//				.permitAll(); // 모든 유저가 로그인 화면은 볼 수 있다.
	}
}