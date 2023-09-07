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
	   private int qid;
	   private String qname;
	   private String qtitle;
	   private String qcontent;
	   private Timestamp qdate;
	   private int qgroup;
	   private int qstep;
	   private int qindent;
	   
	   private int nid;
	   private String nname;
	   private String ntitle;
	   private String ncontent;
	   private Timestamp ndate;
	   private int ngroup;
	   private int nstep;
	   private int nindent;
}