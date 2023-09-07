package edu.global.ex.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	//글전체목록 서비스
	@Override
	public List<BoardVO> getList() {
		log.info("getList()..");
		
		return boardMapper.getList();
	}

	@Override
	public BoardVO read(int bid) {
		log.info("read()..");
		
		return boardMapper.read(bid);
	}

	@Override
	public int modify(BoardVO board) {
		log.info("modify()..");
		
		return boardMapper.update(board);
	}

	@Override
	public int remove(BoardVO board) {
		log.info("remove()..");
		
		return boardMapper.delete(board);
	}

	@Override
	public void register(BoardVO board) {
		log.info("register()..");
		boardMapper.insert(board);
	}

	@Transactional
	@Override
	public void registerReply(BoardVO board) {
		boardMapper.updateShape(board); //답글의 세로 위치를 먼저 잡아 준 후
		boardMapper.insertReply(board); //답글을 등록한다.
	}
	

	   @Override
	   public int getTotal() {      
	      return boardMapper.getTotalCount();
	   }

	   @Override
	   public List<BoardVO> getListWithPaging(Criteria cri) {
	      return boardMapper.getListWithPaging(cri);
	   }

	   
	   
	   
	   
	   
	   
	   
	   
		//글전체목록 서비스
		@Override
		public List<BoardVO> getList1() {
			log.info("getList1()..");
			
			return boardMapper.getList1();
		}

		@Override
		public BoardVO read1(int nid) {
			log.info("read1()..");
			
			return boardMapper.read1(nid);
		}

		@Override
		public int modify1(BoardVO board) {
			log.info("modify1()..");
			
			return boardMapper.update1(board);
		}

		@Override
		public int remove1(BoardVO board) {
			log.info("remove1()..");
			
			return boardMapper.delete1(board);
		}

		@Override
		public void register1(BoardVO board) {
			log.info("register1()..");
			boardMapper.insert1(board);
		}

		@Transactional
		@Override
		public void registerReply1(BoardVO board) {
			boardMapper.updateShape1(board); //답글의 세로 위치를 먼저 잡아 준 후
			boardMapper.insertReply1(board); //답글을 등록한다.
		}
	   
//		   @Override
//		   public int getTotal1() {      
//		      return boardMapper.getTotalCount1();
//		   }
//
//		   @Override
//		   public List<BoardVO> getListWithPaging1(Criteria cri) {
//		      return boardMapper.getListWithPaging1(cri);
//		   }
	   
	   

}