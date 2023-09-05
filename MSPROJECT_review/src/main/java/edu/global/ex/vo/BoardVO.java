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
	   private int rid;
	   private String rname;
	   private String rtitle;
	   private String rcontent;
	   private Timestamp rdate;
	   private int rgroup;
	   private int rstep;
	   private int rindent;
	   
	   private int nid;
	   private String nname;
	   private String ntitle;
	   private String ncontent;
	   private Timestamp ndate;
	   private int ngroup;
	   private int nstep;
	   private int nindent;
}