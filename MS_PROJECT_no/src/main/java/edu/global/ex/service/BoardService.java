package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {

	//qna
	public List<BoardVO> getList(); // 리스트메소드
	public BoardVO read(int qid);  // 글보기메소드
	public int modify(BoardVO board); // 글수정
	public int remove(BoardVO boardVO); // 삭제
	public void register(BoardVO boardVO); //글쓰기
	public void registerReply(BoardVO boardVO); //답글달기
	
	public int getTotal();
	public List<BoardVO> getListWithPaging(Criteria cri);

	//notice
	List<BoardVO> getList_notice(); //리스트 메소드
	BoardVO read_notice(int nid); //글보기 메소드
	int modify_notice(BoardVO board); //글수정
	int remove_notice(BoardVO boardVO); //글삭제
	void register_notice(BoardVO boardVO); //글추가
	void registerReply_notice(BoardVO boardVO); //답변등록
	
	
	//review
	List<BoardVO> getList_review(); //리스트 메소드
	BoardVO read_review(int rid); //글보기 메소드
	int modify_review(BoardVO board); //글수정
	int remove_review(BoardVO boardVO); //글삭제
	void register_review(BoardVO boardVO); //글추가
	void registerReply_review(BoardVO boardVO); //답변등록
	int getTotal_review();
	List<BoardVO> getListWithPaging_review(Criteria cri);
	
	
	//qna review notice 전용
	
	
	//qna
	public List<BoardVO> getList_only(); // 리스트메소드
	public BoardVO read_only(int qid);  // 글보기메소드
	public int modify_only(BoardVO board); // 글수정
	public int remove_only(BoardVO boardVO); // 삭제
	public void register_only(BoardVO boardVO); //글쓰기
	public void registerReply_only(BoardVO boardVO); //답글달기
	
	public int getTotal_only();
	public List<BoardVO> getListWithPaging_only(Criteria cri);

	//notice
	List<BoardVO> getList_notice_qna(); //리스트 메소드
	BoardVO read_notice_qna(int nid); //글보기 메소드
	int modify_notice_qna(BoardVO board); //글수정
	int remove_notice_qna(BoardVO boardVO); //글삭제
	void register_notice_qna(BoardVO boardVO); //글추가
	void registerReply_notice_qna(BoardVO boardVO); //답변등록
	
	List<BoardVO> getList_notice_review(); //리스트 메소드
	BoardVO read_notice_review(int nid); //글보기 메소드
	int modify_notice_review(BoardVO board); //글수정
	int remove_notice_review(BoardVO boardVO); //글삭제
	void register_notice_review(BoardVO boardVO); //글추가
	void registerReply_notice_review(BoardVO boardVO); //답변등록
	
	
	//review
	List<BoardVO> getList_review_only(); //리스트 메소드
	BoardVO read_review_only(int rid); //글보기 메소드
	int modify_review_only(BoardVO board); //글수정
	int remove_review_only(BoardVO boardVO); //글삭제
	void register_review_only(BoardVO boardVO); //글추가
	void registerReply_review_only(BoardVO boardVO); //답변등록
	int getTotal_review_only();
	List<BoardVO> getListWithPaging_review_only(Criteria cri);
	
}
