package com.entities;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {

	private int id;
	private String tittle;
	private String content;
	private Date addeDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddeDate() {
		return addeDate;
	}
	public void setAddeDate(Date addeDate) {
		this.addeDate = addeDate;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", tittle=" + tittle + ", content=" + content + ", addeDate=" + addeDate + "]";
	}
	public Note(String tittle, String content, Date addeDate) {
		super();
		this.id = new Random().nextInt(100000);
		this.tittle = tittle;
		this.content = content;
		this.addeDate = addeDate;
	}
	
	
}
