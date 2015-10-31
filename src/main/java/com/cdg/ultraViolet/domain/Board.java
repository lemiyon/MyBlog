package com.cdg.ultraViolet.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class Board {

	private int boardNo;
	private String contents;
	private String title;
	private int userNo;
	private Date createDate;
	private Date updateDate;
	private int hit;
	
	
}
