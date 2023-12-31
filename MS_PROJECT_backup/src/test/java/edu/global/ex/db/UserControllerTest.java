package edu.global.ex.db;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@WithMockUser(username = "admin", password = "admin", authorities = "ROLE_USER")
	public void adminPageTest() throws Exception {
		
		// 마이페이지
		mockMvc.perform(MockMvcRequestBuilders.get("/login/userprofile"))
			   .andExpect(MockMvcResultMatchers.status().isOk());
				
		// 회원 마이페이지 회원 정보 수정 페이지
		mockMvc.perform(MockMvcRequestBuilders.get("/login/userprofile"))
			   .andExpect(MockMvcResultMatchers.status().isOk());

	}
}
