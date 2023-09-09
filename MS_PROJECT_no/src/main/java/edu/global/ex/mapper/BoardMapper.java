package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {

	
	public List<BoardVO> getList();
	public BoardVO read(int qid);//파라미터 = rul로 넘어오는 qid값
	public int update(BoardVO board);
	public int delete(BoardVO qid);
	public void insert(BoardVO board);
	
	public void updateShape(BoardVO board);
	public void insertReply(BoardVO board);
	
	//paging관련
	int getTotalCount();
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	
	//notice
	public List<BoardVO> getList_notice();
	BoardVO read_notice(int nid);
	int update_notice(BoardVO board);
	int delete_notice(BoardVO board); //글삭제
	public void insert_notice(BoardVO board);
	public void updateShape_notice(BoardVO board);
	public void insertReply_notice(BoardVO board);
	
	
	//review
	public List<BoardVO> getList_review();
	public BoardVO read_review(int rid);//파라미터 = rul로 넘어오는 rid값
	public int update_review(BoardVO board);
	public int delete_review(BoardVO rid);
	public void insert_review(BoardVO board);
	
	public void updateShape_review(BoardVO board);
	public void insertReply_review(BoardVO board);
	
	//paging관련
	int getTotalCount_review();
	public List<BoardVO> getListWithPaging_review(Criteria cri);
	
	
	
	//qna review notice 전용
	
	
	public List<BoardVO> getList_only();
	public BoardVO read_only(int qid);//파라미터 = rul로 넘어오는 qid값
	public int update_only(BoardVO board);
	public int delete_only(BoardVO qid);
	public void insert_only(BoardVO board);
	
	public void updateShape_only(BoardVO board);
	public void insertReply_only(BoardVO board);
	
	//paging관련
	int getTotalCount_only();
	public List<BoardVO> getListWithPaging_only(Criteria cri);
	
	
	
	public List<BoardVO> getList_review_only();
	public BoardVO read_review_only(int rid);//파라미터 = rul로 넘어오는 rid값
	public int update_review_only(BoardVO board);
	public int delete_review_only(BoardVO rid);
	public void insert_review_only(BoardVO board);
	
	public void updateShape_review_only(BoardVO board);
	public void insertReply_review_only(BoardVO board);
	
	//paging관련
	int getTotalCount_review_only();
	public List<BoardVO> getListWithPaging_review_only(Criteria cri);
	
	
	
	
	public List<BoardVO> getList_notice_qna();
	BoardVO read_notice_qna(int nid);
	int update_notice_qna(BoardVO board);
	int delete_notice_qna(BoardVO board); //글삭제
	public void insert_notice_qna(BoardVO board);
	public void updateShape_notice_qna(BoardVO board);
	public void insertReply_notice_qna(BoardVO board);
	
	
	public List<BoardVO> getList_notice_review();
	BoardVO read_notice_review(int nid);
	int update_notice_review(BoardVO board);
	int delete_notice_review(BoardVO board); //글삭제
	public void insert_notice_review(BoardVO board);
	public void updateShape_notice_review(BoardVO board);
	public void insertReply_notice_review(BoardVO board);
	
}
