package edu.global.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.global.ex.page.Criteria;
import edu.global.ex.page.PageVO;
import edu.global.ex.service.BoardService;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	//전체게시판 보기
	
	@GetMapping("/list")
	public String list2(Criteria cri, Model model) {
		log.info("list()..");
		log.info("list() 크리테리아값 확인" + cri);

//		model.addAttribute("boardList_base",boardService.getList_notice());
//		model.addAttribute("boardList_notice",boardService.getList_notice());
//		model.addAttribute("boardList",boardService.getList_notice());
//		model.addAttribute("boardList_review",boardService.getList_notice());
		
		model.addAttribute("boardList_notice",boardService.getList_notice());
		model.addAttribute("boardList", boardService.getListWithPaging(cri));
		model.addAttribute("boardList_review", boardService.getListWithPaging_review(cri));

		int total = boardService.getTotal();
		log.info("list() 게시판 전체 갯수" + total);

		model.addAttribute("pageMaker", new PageVO(cri, total));

		return "/board/list";
	}
		
	@PostMapping("/write_notice")
	public String write_notice(BoardVO boardVO) {
		log.info("write_notice().." +  boardVO);
		
		boardService.register_notice(boardVO);
		
		return "redirect:list";
	}
	
	@GetMapping("/write_view_notice")
	public String write_view_notice() {
		log.info("write_view_notice()..");
		
		return "/board/write_view_notice";
	}
	
	@GetMapping("/reply_view_notice")
	public String reply_view_notice(BoardVO boardVO, Model model) {
		log.info("reply_view_notice()..");
		
		model.addAttribute("reply_view_notice",boardService.read_notice(boardVO.getNid()));
		
		return "/board/reply_view_notice";
	}
	
	@GetMapping("/content_view_notice")
	public String content_view_notice(BoardVO boardVO, Model model) {
		log.info("content_view_notice()..");
		
		int nid = boardVO.getNid();
		model.addAttribute("content_view_notice",boardService.read_notice(nid));
		
		return "/board/content_view_notice";
	}
	
	@PostMapping("/modify_notice")
	public String modify_notice(BoardVO boardVO) {
		log.info("modify_notice()..");
		
		int rn = boardService.modify_notice(boardVO);
		
		log.info("modify_notice()..result number ::" + rn);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete_notice")
	public String delete_notice(BoardVO boardVO) {
		log.info("delete_notice()..");
		
		int rn = boardService.remove_notice(boardVO);
		
		log.info("delete_notice().." + rn);
		
		return "redirect:list";
	}
	
	@PostMapping("/reply_notice")
	public String reply_notice(BoardVO boardVO) {
		log.info("reply_notice()..");
		
		boardService.registerReply_notice(boardVO);
		
		return "redirect:list";
	}
	
	//밑으로 qna
		
	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view()..");
		
		int qid = boardVO.getQid();
		model.addAttribute("content_view",boardService.read(qid));
		
		return "/board/content_view";
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify()..");
		
		int rn = boardService.modify(boardVO);
		
		log.info("modify()..result number ::" + rn);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete()..");
		
		int rn = boardService.remove(boardVO);
		
		log.info("delete().." + rn);
		
		return "redirect:list";
	}
	
	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view()..");
		
		return "/board/write_view";
	}
	@PostMapping("/write")
	public String write(BoardVO boardVO) {
		log.info("write()..");
		
		boardService.register(boardVO);
		
		return "redirect:list";
	}
	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) {
		log.info("reply_view()..");
		
		model.addAttribute("reply_view",boardService.read(boardVO.getQid()));
		
		return "/board/reply_view";
	}
	
	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {
		log.info("reply()..");
		
		boardService.registerReply(boardVO);
		
		return "redirect:list";
	}
	
	
	@GetMapping("/qna")
	public String qna(Criteria cri, Model model) {
		log.info("qna()..");
		log.info("qna() 크리테리아값 확인" + cri);

		model.addAttribute("boardList_notice",boardService.getList_notice());
		model.addAttribute("boardList", boardService.getListWithPaging(cri));

		int total = boardService.getTotal();
		log.info("list() 게시판 전체 갯수" + total);

		model.addAttribute("pageMaker", new PageVO(cri, total));

		return "/board/qna";
	}
	
	
	//밑으로 review
	
	@GetMapping("/content_view_review")
	public String content_view_review(BoardVO boardVO, Model model) {
		log.info("content_view_review()..");

		int rid = boardVO.getRid();
		model.addAttribute("content_view_review", boardService.read_review(rid));

		return "/board/content_view_review";
	}

	@PostMapping("/modify_review")
	public String modify_review(BoardVO boardVO) {
		log.info("modify_review()..");

		int rn = boardService.modify_review(boardVO);

		log.info("modify_review()..result number ::" + rn);

		return "redirect:list";
	}

	@GetMapping("/delete_review")
	public String delete_review(BoardVO boardVO) {
		log.info("delete_review()..");

		int rn = boardService.remove_review(boardVO);

		log.info("delete_review().." + rn);

		return "redirect:list";
	}

	@GetMapping("/write_view_review")
	public String write_view_review() {
		log.info("write_view_review()..");

		return "/board/write_view_review";
	}

	@PostMapping("/write_review")
	public String write_review(BoardVO boardVO) {
		log.info("write_review().." + boardVO);

		boardService.register_review(boardVO);

		return "redirect:list";
	}

	@GetMapping("/reply_view_review")
	public String reply_view_review(BoardVO boardVO, Model model) {
		log.info("reply_view_review()..");

		model.addAttribute("reply_view_review", boardService.read_review(boardVO.getRid()));

		return "/board/reply_view_review";
	}

	@PostMapping("/reply_review")
	public String reply_review(BoardVO boardVO) {
		log.info("reply_review()..");

		boardService.registerReply_review(boardVO);

		return "redirect:list";
	}
	
	@GetMapping("/review")
	public String review(Criteria cri, Model model) {
		log.info("review()..");
		log.info("review() 크리테리아값 확인" + cri);

		model.addAttribute("boardList_notice",boardService.getList_notice());
		model.addAttribute("boardList_review", boardService.getListWithPaging_review(cri));

		int total = boardService.getTotal();
		log.info("list() 게시판 전체 갯수" + total);

		model.addAttribute("pageMaker", new PageVO(cri, total));

		return "/board/review";
	}
	
	
	
	
	
	//qna review notice 전용
	
	
	@GetMapping("/content_view_only")
	public String content_view_only(BoardVO boardVO, Model model) {
		log.info("content_view_only()..");
		
		int qid = boardVO.getQid();
		model.addAttribute("content_view_only",boardService.read_only(qid));
		
		return "/board/content_view_only";
	}
	
	
	@PostMapping("/modify_only")
	public String modify_only(BoardVO boardVO) {
		log.info("modify_only()..");
		
		int rn = boardService.modify_only(boardVO);
		
		log.info("modify_only()..result number ::" + rn);
		
		return "redirect:qna";
	}
	
	@GetMapping("/delete_only")
	public String delete_only(BoardVO boardVO) {
		log.info("delete_only()..");
		
		int rn = boardService.remove_only(boardVO);
		
		log.info("delete().." + rn);
		
		return "redirect:qna";
	}
	
	@GetMapping("/write_view_only")
	public String write_view_only() {
		log.info("write_view_only()..");
		
		return "/board/write_view_only";
	}
	@PostMapping("/write_only")
	public String write_only(BoardVO boardVO) {
		log.info("write_only()..");
		
		boardService.register_only(boardVO);
		
		return "redirect:qna";
	}
	@GetMapping("/reply_view_only")
	public String reply_view_only(BoardVO boardVO, Model model) {
		log.info("reply_view_only()..");
		
		model.addAttribute("reply_view_only",boardService.read_only(boardVO.getQid()));
		
		return "/board/reply_view_only";
	}
	
	@PostMapping("/reply_only")
	public String reply_only(BoardVO boardVO) {
		log.info("reply_only()..");
		
		boardService.registerReply_only(boardVO);
		
		return "redirect:qna";
	}
	
	
	
	
	

	
	
	@GetMapping("/content_view_review_only")
	public String content_view_review_only(BoardVO boardVO, Model model) {
		log.info("content_view_review_only()..");

		int rid = boardVO.getRid();
		model.addAttribute("content_view_review_only", boardService.read_review_only(rid));

		return "/board/content_view_review_only";
	}

	@PostMapping("/modify_review_only")
	public String modify_review_only(BoardVO boardVO) {
		log.info("modify_review_only()..");

		int rn = boardService.modify_review_only(boardVO);

		log.info("modify_review()..result number ::" + rn);

		return "redirect:review";
	}

	@GetMapping("/delete_review_only")
	public String delete_review_only(BoardVO boardVO) {
		log.info("delete_review_only()..");

		int rn = boardService.remove_review_only(boardVO);

		log.info("delete_review_only().." + rn);

		return "redirect:review";
	}

	@GetMapping("/write_view_review_only")
	public String write_view_review_only() {
		log.info("write_view_review_only()..");

		return "/board/write_view_review_only";
	}

	@PostMapping("/write_review_only")
	public String write_review_only(BoardVO boardVO) {
		log.info("write_review_only()..");

		boardService.register_review_only(boardVO);

		return "redirect:review";
	}

	@GetMapping("/reply_view_review_only")
	public String reply_view_review_only(BoardVO boardVO, Model model) {
		log.info("reply_view_review_only()..");

		model.addAttribute("reply_view_review_only", boardService.read_review_only(boardVO.getRid()));

		return "/board/reply_view_review_only";
	}

	@PostMapping("/reply_review_only")
	public String reply_review_only(BoardVO boardVO) {
		log.info("reply_review_only()..");

		boardService.registerReply_review_only(boardVO);

		return "redirect:review";
	}
	

	
	
	
	
	
	
	@GetMapping("/content_view_notice_qna")
	public String content_view_notice_qna(BoardVO boardVO, Model model) {
		log.info("content_view_notice_qna()..");
		
		int nid = boardVO.getNid();
		model.addAttribute("content_view_notice_qna",boardService.read_notice_qna(nid));
		
		return "/board/content_view_notice_qna";
	}
	
	@GetMapping("/content_view_notice_review")
	public String content_view_notice_review(BoardVO boardVO, Model model) {
		log.info("content_view_notice_review()..");
		
		int nid = boardVO.getNid();
		model.addAttribute("content_view_notice_review",boardService.read_notice_review(nid));
		
		return "/board/content_view_notice_review";
	}	
	
	
	@PostMapping("/write_notice_qna")
	public String write_notice_qna(BoardVO boardVO) {
		log.info("write_notice_qna().." +  boardVO);
		
		boardService.register_notice_qna(boardVO);
		
		return "redirect:qna";
	}
	
	@GetMapping("/write_view_notice_qna")
	public String write_view_notice_qna() {
		log.info("write_view_notice_qna()..");
		
		return "/board/write_view_notice_qna";
	}
	
	@GetMapping("/reply_view_notice_qna")
	public String reply_view_notice_qna(BoardVO boardVO, Model model) {
		log.info("reply_view_notice_qna()..");
		
		model.addAttribute("reply_view_notice_qna",boardService.read_notice_qna(boardVO.getNid()));
		
		return "/board/reply_view_notice_qna";
	}
	
	
	@PostMapping("/modify_notice_qna")
	public String modify_notice_qna(BoardVO boardVO) {
		log.info("modify_notice_qna()..");
		
		int rn = boardService.modify_notice_qna(boardVO);
		
		log.info("modify_notice_qna()..result number ::" + rn);
		
		return "redirect:qna";
	}
	
	@GetMapping("/delete_notice_qna")
	public String delete_notice_qna(BoardVO boardVO) {
		log.info("delete_notice_qna()..");
		
		int rn = boardService.remove_notice_qna(boardVO);
		
		log.info("delete_notice_qna().." + rn);
		
		return "redirect:qna";
	}
	
	@PostMapping("/reply_notice_qna")
	public String reply_notice_qna(BoardVO boardVO) {
		log.info("reply_notice_qna()..");
		
		boardService.registerReply_notice_qna(boardVO);
		
		return "redirect:qna";
	}
	
	
	
	
	
	
	
	@PostMapping("/write_notice_review")
	public String write_notice_review(BoardVO boardVO) {
		log.info("write_notice_review().." +  boardVO);
		
		boardService.register_notice_review(boardVO);
		
		return "redirect:review";
	}
	
	@GetMapping("/write_view_notice_review")
	public String write_view_notice_review() {
		log.info("write_view_notice_review()..");
		
		return "/board/write_view_notice_review";
	}
	
	@GetMapping("/reply_view_notice_review")
	public String reply_view_notice_review(BoardVO boardVO, Model model) {
		log.info("reply_view_notice_review()..");
		
		model.addAttribute("reply_view_notice_review",boardService.read_notice_review(boardVO.getNid()));
		
		return "/board/reply_view_notice_review";
	}
	
	
	@PostMapping("/modify_notice_review")
	public String modify_notice_review(BoardVO boardVO) {
		log.info("modify_notice_review()..");
		
		int rn = boardService.modify_notice_review(boardVO);
		
		log.info("modify_notice_review()..result number ::" + rn);
		
		return "redirect:review";
	}
	
	@GetMapping("/delete_notice_review")
	public String delete_notice_review(BoardVO boardVO) {
		log.info("delete_notice_review()..");
		
		int rn = boardService.remove_notice_review(boardVO);
		
		log.info("delete_notice_review().." + rn);
		
		return "redirect:review";
	}
	
	@PostMapping("/reply_notice_review")
	public String reply_notice_review(BoardVO boardVO) {
		log.info("reply_notice_review()..");
		
		boardService.registerReply_notice_review(boardVO);
		
		return "redirect:review";
	}
	
	
		
}
