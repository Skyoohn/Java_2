package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.global.ex.mapper.CompanyMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.service.BoardService;
import edu.global.ex.service.CompanyService;
import edu.global.ex.vo.BoardVO;
import edu.global.ex.vo.CompanyVO;
import edu.global.ex.vo.CustomUserDetailsVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
//  admin/company : 회사정보
//	admin/admin : 관리자페이지 홈
//	
//	admin/board/home : 관리자용 게시판 홈
//	admin/board/review : 리뷰 관리
//	admin/board/notice : 공지사항
//	admin/board/qna : qna관리
//	
//	
//	admin/product/home : 관리자용 상품관리 홈
//	admin/product/list : 관리자용 상품관리 리스트
//	admin/product/new : 관리자용 상품등록
//	
//	admin/order : 관리자용 주문관리 홈
//	
	@Autowired
	private CompanyMapper cmp;
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private BoardService boardService;

	@GetMapping("/")
	public String home(@AuthenticationPrincipal CustomUserDetailsVO customUserDetailsVO) {
//		if (customUserDetailsVO != null) {
//        List<GrantedAuthority> authorities = (List<GrantedAuthority>) customUserDetailsVO.getAuthorities();
//
//        for (GrantedAuthority auth : authorities) {
//            String authString = auth.toString();
//            if (authString.equals("ROLE_ADMIN")) {
//                return "redirect:/admin/admin";
//            }
//            // 추가적인 권한에 따른 리다이렉션 처리를 여기에 추가할 수 있습니다.
//            // else if (authString.equals("ROLE_USER")) {
//            //     return "redirect:/user/profile";
//            // }
//        }
    
    return "index";
	}
	
	@GetMapping("/shop/ring")
	public String shopRing() {
		log.info("shopRing()..");
		return "/shop/ring";
	}
	
	///게시판
	
	@GetMapping("/community")
	public String community(Criteria cri, Model model) {
		log.info("community()..");
		log.info("community() 크리테리아값 확인" + cri);

		model.addAttribute("boardList", boardService.getNotice());
		model.addAttribute("boardList_Qna", boardService.getQna());
		model.addAttribute("boardList_Review", boardService.getReview());

		return "/community";
	}
	
	@GetMapping("/shop")
	public String shop() {
		log.info("shop()..");
		return "/shop";
	}
	
	@GetMapping("/cart")
	public String cart() {
		log.info("cart()..");
		return "/cart";
	}
	
	@GetMapping("/pay")
	public String pay() {
		log.info("pay()..");
		return "/pay";
	}
	
	@GetMapping("/ring")
	public String ring() {
		log.info("ring()..");
		return "/shop/ring";
	}

	@GetMapping("/user/userHome")
	public void userHome() {
		log.info("userHome()..");
		// return "home";
	}

	@GetMapping("/admin/admin")
	public String adminHome() {
		log.info("adminHome()..");
		return "/admin/admin";

		// return "home";
	}
	
	@GetMapping("/admin")
	public String admLogin() {
		log.info("admLogin()..");
		return "/admin/login";

		// return "home";
	}
	
//	@GetMapping("/admin/index")
//	public String adminIndex() {
//		log.info("adminIndex()");
//		return "/admin/index";
//	}

	@GetMapping("/admin/company")
	public String adminCompany(CompanyVO companyVO, Model model) {
		log.info("adminCompany..");
		
		model.addAttribute("company", companyService.getCompany(companyVO));
		return "/admin/company";
	}
	
	@GetMapping("/admin/company_write")
	public String adminCompanyWrite() {
		log.info("adminCompanyWrite..");
		return "/admin/company_write";
	}

	@PostMapping("/admin/company")
	public String companyPost(CompanyVO cvo) {
		log.info("companyPost()..");
		
	
		
		cmp.insert(cvo);
		
		return "redirect:/admin/company";
	}
	

	///// 게시판
	
	@GetMapping("/admin/write_view")
	public String write_view() {

		log.info("write_view()..");

		return "admin/board/write_view";
	}
	
	@PostMapping("/admin/write")
	public String write(BoardVO boardVO) {

		log.info("write()..");
		
		boardService.register(boardVO);

		return "redirect:board";
	}
	
	@PostMapping("/admin/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify()..");

		int rn = boardService.modify(boardVO);

		log.info("modify().. result number :: " + rn);

		return "redirect:board";
	}
	
	@GetMapping("/admin/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view()..");

		int bid = boardVO.getBid();

		model.addAttribute("content_view", boardService.read(bid));

		return "/admin/board/content_view";
	}
	
	@GetMapping("/admin/delete")
	public String delete(BoardVO bid, Model model) {

		log.info("delete()..");

		model.addAttribute("delete", boardService.delete(bid));

		return "redirect:board";
	}
	
	@GetMapping("/admin/board")
	public String adminBoardHome(Criteria cri, Model model) {
		log.info("adminBoardHome");
		
		model.addAttribute("boardList", boardService.getList());
		return "/admin/board/list";
	}


	
	@GetMapping("/admin/board/notice")
	public String adminBoardNotice() {
		log.info("adminBoardNotice");
		return "/admin/board/notice";
	}

	@GetMapping("/admin/board/qna")
	public String adminBoardQNA() {
		log.info("adminBoardQna");
		return "/admin/board/qna";
	}

	@GetMapping("/admin/board/review")
	public String adminBoardReview() {
		log.info("adminBoardReview");
		return "/admin/board/review";
	}
	
	///// 게시판

	@GetMapping("/admin/product/home")
	public String adminProductHome() {
		log.info("adminProductHome");
		return "/admin/product/home";
	}

	@GetMapping("/admin/product/list")
	public String adminProductList() {
		log.info("adminProductList");
		return "/admin/product/product_list";
	}

	@GetMapping("/admin/product/new")
	public String adminProductNew() {
		log.info("adminProductNew");
		return "/admin/product/product_new";
	}
	
	@GetMapping("/admin/order/list")
	public String adminOrderList() {
		log.info("adminOrderList");
		return "/admin/order/order_list";
	}

	

}
