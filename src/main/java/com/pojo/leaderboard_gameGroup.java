package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class leaderboard_gameGroup {
	public leaderboard_gameGroup(String to, String subject, Integer code, Boolean inApp, List<Object> content,
			String contentMessage, String contentData, String contentCategory) {
		super();
		this.to = to;
		this.subject = subject;
		this.code = code;
		this.inApp = inApp;
		this.content = content;
		this.contentMessage = contentMessage;
		this.contentData = contentData;
		this.contentCategory = contentCategory;
	}

	private String to;
	private String subject;
	private Integer code;
	private Boolean inApp;
	private List<Object> content = new ArrayList<Object>();
	private String contentMessage;
	private String contentData;
	private String contentCategory;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getInApp() {
		return inApp;
	}

	public void setInApp(Boolean inApp) {
		this.inApp = inApp;
	}

	public List<Object> getContent() {
		return content;
	}

	public void setContent(List<Object> content) {
		this.content = content;
	}

	public String getContentMessage() {
		return contentMessage;
	}

	public void setContentMessage(String contentMessage) {
		this.contentMessage = contentMessage;
	}

	public String getContentData() {
		return contentData;
	}

	public void setContentData(String contentData) {
		this.contentData = contentData;
	}

	public String getContentCategory() {
		return contentCategory;
	}

	public void setContentCategory(String contentCategory) {
		this.contentCategory = contentCategory;
	}
}
