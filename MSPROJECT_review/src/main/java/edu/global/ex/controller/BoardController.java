package edu.global.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	@PostMapping("/write2")
	public String write2(BoardVO boardVO) {
		log.info("write2().." +  boardVO);
		
		boardService.register1(boardVO);
		
		return "redirect:list2";
	}
	
	@GetMapping("/write_view2")
	public String write_view2() {
		log.info("write_view2()..");
		
		return "/board/write_view2";
	}
	
	@GetMapping("/reply_view2")
	public String reply_view2(BoardVO boardVO, Model model) {
		log.info("reply_view2()..");
		
		model.addAttribute("reply_view2",boardService.read1(boardVO.getNid()));
		
		return "/board/reply_view2";
	}
	
	@GetMapping("/content_view2")
	public String content_view2(BoardVO boardVO, Model model) {
		log.info("content_view2()..");
		
		int nid = boardVO.getNid();
		model.addAttribute("content_view2",boardService.read1(nid));
		
		return "/board/content_view2";
	}
	
	@PostMapping("/modify1")
	public String modify1(BoardVO boardVO) {
		log.info("modify1()..");
		
		int rn = boardService.modify1(boardVO);
		
		log.info("modify1()..result number ::" + rn);
		
		return "redirect:list2";
	}
	
	@GetMapping("/delete1")
	public String delete1(BoardVO boardVO) {
		log.info("delete1()..");
		
		int rn = boardService.remove1(boardVO);
		
		log.info("delete1().." + rn);
		
		return "redirect:list2";
	}
	
	@PostMapping("/reply1")
	public String reply1(BoardVO boardVO) {
		log.info("reply1()..");
		
		boardService.registerReply1(boardVO);
		
		return "redirect:list2";
	}
	
	//밑으로 review

	@GetMapping("/list")
	public String list(Model model) {
		log.info("list()..");

		model.addAttribute("boardList", boardService.getList());

		return "/board/list";
	}

	@GetMapping("/list2")
	public String list2(Criteria cri, Model model) {
		log.info("list2()..");
		log.info("list2() 크리테리아값 확인" + cri);

		model.addAttribute("boardList2",boardService.getList1());
		model.addAttribute("boardList", boardService.getListWithPaging(cri));

		int total = boardService.getTotal();
		log.info("list2() 게시판 전체 갯수" + total);

		model.addAttribute("pageMaker", new PageVO(cri, total));

		return "/board/list2";
	}

	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view()..");

		int rid = boardVO.getRid();
		model.addAttribute("content_view", boardService.read(rid));

		return "/board/content_view";
	}

	@PostMapping("/modify")
	public String modify(BoardVO boardVO) {
		log.info("modify()..");

		int rn = boardService.modify(boardVO);

		log.info("modify()..result number ::" + rn);

		return "redirect:list2";
	}

	@GetMapping("/delete")
	public String delete(BoardVO boardVO) {
		log.info("delete()..");

		int rn = boardService.remove(boardVO);

		log.info("delete().." + rn);

		return "redirect:list2";
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

		return "redirect:list2";
	}

	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) {
		log.info("reply_view()..");

		model.addAttribute("reply_view", boardService.read(boardVO.getRid()));

		return "/board/reply_view";
	}

	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {
		log.info("reply()..");

		boardService.registerReply(boardVO);

		return "redirect:list2";
	}

}