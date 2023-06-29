package com.entities;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class Note {

	@Id
	private String id;
	private String title;
	@Column(length = 1500)
	private String content;
	private Date addedDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addeDate) {
		this.addedDate = addeDate;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", content=" + content + ", addedDate=" + addedDate + "]";
	}
	public Note(String title, String content, Date addeDate) {
		super();
//		this.id = new Random().nextInt(100000);
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.content = content;
		this.addedDate = addeDate;
	}
	
	
}
