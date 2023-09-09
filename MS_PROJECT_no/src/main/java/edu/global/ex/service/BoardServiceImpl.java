package edu.global.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> getList() {

		log.info("getList()..");

		return boardMapper.getList();

	};

	@Override
	public BoardVO read(int qid) {

		log.info("read()..");

		return boardMapper.read(qid);
	}

	@Override
	public int modify(BoardVO board) {

		log.info("modify()..");

		return boardMapper.update(board);
	}

	@Override
	public int remove(BoardVO qid) {

		log.info("remove()..");

		return boardMapper.delete(qid);
	}

	@Override
	public void register(BoardVO board) {

		log.info("register()..");

		boardMapper.insert(board);
	}

	@Override
	public void registerReply(BoardVO board) {

		log.info("registerReply()..");

		boardMapper.updateShape(board);// 답글의 세로 위치를 먼저 잡아준 후
		boardMapper.insertReply(board);// 답글을 등록한다.
	}

	@Override
	public int getTotal() {
		
		return boardMapper.getTotalCount();
	}

	@Override
	public List<BoardVO> getListWithPaging(Criteria cri) {
		
		return boardMapper.getListWithPaging(cri);
	}



	   //밑으로 공지
	   
		@Override
		public List<BoardVO> getList_notice() {
			log.info("getList_notice()..");
			
			return boardMapper.getList_notice();
		}

		@Override
		public BoardVO read_notice(int nid) {
			log.info("read_notice()..");
			
			return boardMapper.read_notice(nid);
		}

		@Override
		public int modify_notice(BoardVO board) {
			log.info("modify_notice()..");
			
			return boardMapper.update_notice(board);
		}

		@Override
		public int remove_notice(BoardVO board) {
			log.info("remove_notice()..");
			
			return boardMapper.delete_notice(board);
		}

		@Override
		public void register_notice(BoardVO board) {
			log.info("register_notice()..");
			boardMapper.insert_notice(board);
		}

		@Transactional
		@Override
		public void registerReply_notice(BoardVO board) {
			boardMapper.updateShape_notice(board); //답글의 세로 위치를 먼저 잡아 준 후
			boardMapper.insertReply_notice(board); //답글을 등록한다.
		}
	
	//review
		
		@Override
		public List<BoardVO> getList_review() {
			log.info("getList_review()..");
			
			return boardMapper.getList_review();
		}

		@Override
		public BoardVO read_review(int rid) {
			log.info("read_review()..");
			
			return boardMapper.read_review(rid);
		}

		@Override
		public int modify_review(BoardVO board) {
			log.info("modify_review()..");
			
			return boardMapper.update_review(board);
		}

		@Override
		public int remove_review(BoardVO board) {
			log.info("remove_review()..");
			
			return boardMapper.delete_review(board);
		}

		@Override
		public void register_review(BoardVO board) {
			log.info("register_review()..");
			boardMapper.insert_review(board);
		}

		@Transactional
		@Override
		public void registerReply_review(BoardVO board) {
			boardMapper.updateShape_review(board); //답글의 세로 위치를 먼저 잡아 준 후
			boardMapper.insertReply_review(board); //답글을 등록한다.
		}
		

		   @Override
		   public int getTotal_review() {      
		      return boardMapper.getTotalCount_review();
		   }

		   @Override
		   public List<BoardVO> getListWithPaging_review(Criteria cri) {
		      return boardMapper.getListWithPaging_review(cri);
		   }

		   //qna + review + notice
		   
		   
			@Override
			public List<BoardVO> getList_only() {

				log.info("getList_only()..");

				return boardMapper.getList_only();

			};

			@Override
			public BoardVO read_only(int qid) {

				log.info("read_only()..");

				return boardMapper.read_only(qid);
			}

			@Override
			public int modify_only(BoardVO board) {

				log.info("modify_only()..");

				return boardMapper.update_only(board);
			}

			@Override
			public int remove_only(BoardVO qid) {

				log.info("remove_only()..");

				return boardMapper.delete_only(qid);
			}

			@Override
			public void register_only(BoardVO board) {

				log.info("register_only()..");

				boardMapper.insert_only(board);
			}

			@Override
			public void registerReply_only(BoardVO board) {

				log.info("registerReply_only()..");

				boardMapper.updateShape_only(board);// 답글의 세로 위치를 먼저 잡아준 후
				boardMapper.insertReply_only(board);// 답글을 등록한다.
			}

			@Override
			public int getTotal_only() {
				
				return boardMapper.getTotalCount_only();
			}

			@Override
			public List<BoardVO> getListWithPaging_only(Criteria cri) {
				
				return boardMapper.getListWithPaging_only(cri);
			}

			
			
			
			
			
			@Override
			public List<BoardVO> getList_review_only() {
				log.info("getList_review_only()..");
				
				return boardMapper.getList_review_only();
			}

			@Override
			public BoardVO read_review_only(int rid) {
				log.info("read_review_only()..");
				
				return boardMapper.read_review_only(rid);
			}

			@Override
			public int modify_review_only(BoardVO board) {
				log.info("modify_review_only()..");
				
				return boardMapper.update_review_only(board);
			}

			@Override
			public int remove_review_only(BoardVO board) {
				log.info("remove_review_only()..");
				
				return boardMapper.delete_review_only(board);
			}

			@Override
			public void register_review_only(BoardVO board) {
				log.info("register_review_only()..");
				boardMapper.insert_review_only(board);
			}

			@Transactional
			@Override
			public void registerReply_review_only(BoardVO board) {
				boardMapper.updateShape_review_only(board); //답글의 세로 위치를 먼저 잡아 준 후
				boardMapper.insertReply_review_only(board); //답글을 등록한다.
			}
			

			   @Override
			   public int getTotal_review_only() {      
			      return boardMapper.getTotalCount_review_only();
			   }

			   @Override
			   public List<BoardVO> getListWithPaging_review_only(Criteria cri) {
			      return boardMapper.getListWithPaging_review_only(cri);
			   }
		   
			   
			   
			   
			   
			   
			   
				@Override
				public List<BoardVO> getList_notice_qna() {
					log.info("getList_notice_qna()..");
					
					return boardMapper.getList_notice_qna();
				}

				@Override
				public BoardVO read_notice_qna(int nid) {
					log.info("read_notice_qna()..");
					
					return boardMapper.read_notice_qna(nid);
				}

				@Override
				public int modify_notice_qna(BoardVO board) {
					log.info("modify_notice_qna()..");
					
					return boardMapper.update_notice_qna(board);
				}

				@Override
				public int remove_notice_qna(BoardVO board) {
					log.info("remove_notice_qna()..");
					
					return boardMapper.delete_notice_qna(board);
				}

				@Override
				public void register_notice_qna(BoardVO board) {
					log.info("register_notice_qna()..");
					boardMapper.insert_notice_qna(board);
				}

				@Transactional
				@Override
				public void registerReply_notice_qna(BoardVO board) {
					boardMapper.updateShape_notice_qna(board); //답글의 세로 위치를 먼저 잡아 준 후
					boardMapper.insertReply_notice_qna(board); //답글을 등록한다.
				}
			   
				
				
				
				
				
				
				@Override
				public List<BoardVO> getList_notice_review() {
					log.info("getList_notice_review()..");
					
					return boardMapper.getList_notice_review();
				}

				@Override
				public BoardVO read_notice_review(int nid) {
					log.info("read_notice_review()..");
					
					return boardMapper.read_notice_review(nid);
				}

				@Override
				public int modify_notice_review(BoardVO board) {
					log.info("modify_notice_review()..");
					
					return boardMapper.update_notice_review(board);
				}

				@Override
				public int remove_notice_review(BoardVO board) {
					log.info("remove_notice_review()..");
					
					return boardMapper.delete_notice_review(board);
				}

				@Override
				public void register_notice_review(BoardVO board) {
					log.info("register_notice_review()..");
					boardMapper.insert_notice_review(board);
				}

				@Transactional
				@Override
				public void registerReply_notice_review(BoardVO board) {
					boardMapper.updateShape_notice_review(board); //답글의 세로 위치를 먼저 잡아 준 후
					boardMapper.insertReply_notice_review(board); //답글을 등록한다.
				}
			   
		   
}
