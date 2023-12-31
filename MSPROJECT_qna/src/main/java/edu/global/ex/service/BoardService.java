package edu.global.ex.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getList(); //리스트 메소드
	BoardVO read(int qid); //글보기 메소드
	int modify(BoardVO board); //글수정
	int remove(BoardVO boardVO); //글삭제
	void register(BoardVO boardVO); //글추가
	void registerReply(BoardVO boardVO); //답변등록
	int getTotal();
	List<BoardVO> getListWithPaging(Criteria cri);
	
	List<BoardVO> getList1(); //리스트 메소드
	BoardVO read1(int nid); //글보기 메소드
	int modify1(BoardVO board); //글수정
	int remove1(BoardVO boardVO); //글삭제
	void register1(BoardVO boardVO); //글추가
	void registerReply1(BoardVO boardVO); //답변등록

}