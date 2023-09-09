package edu.global.ex.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BoardVO {

//	private int bid;
//	private String bname;
//	private String btitle;
//	private String bcontent;
//	private Timestamp bdate;
//	private int bhit;
//	private int bgroup;
//	private int bstep;
//	private int bindent;

	private int selecter;

	// 공지
	private int nid;
	private String nname;
	private String ntitle;
	private String ncontent;
	private Timestamp ndate;
	private int ngroup;
	private int nstep;
	private int nindent;

	// qna
	private int qid;
	private String qname;
	private String qtitle;
	private String qcontent;
	private Timestamp qdate;
	private int qgroup;
	private int qstep;
	private int qindent;

	// review
	private int rid;
	private String rname;
	private String rtitle;
	private String rcontent;
	private Timestamp rdate;
	private int rgroup;
	private int rstep;
	private int rindent;

}
