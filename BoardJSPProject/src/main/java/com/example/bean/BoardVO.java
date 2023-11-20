package com.example.bean;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class BoardVO {
	private int seq;
	private String category;
	private String title;
	private String writer;
	private String content;
	private Timestamp regdate;
	private int cnt;
	private Timestamp newdate;

	public Timestamp getNewdate() {
		return newdate;
	}

	public void setNewdate(Timestamp newdate) {
		this.newdate = newdate;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getCategory(){ return category;}
	public void setCategory(String category) {this.category = category;}
}
