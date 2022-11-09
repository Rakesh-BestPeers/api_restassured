package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class notify_root {
	public notify_root(Integer code, notify_content content, String from, Boolean inApp, String subject,
			List<String> to) {
		super();
		this.code = code;
		this.content = content;
		this.from = from;
		this.inApp = inApp;
		this.subject = subject;
		this.to = to;
	}

	private Integer code;
	private notify_content content;
	private String from;
	private Boolean inApp;
	private String subject;
	private List<String> to = new ArrayList<String>();

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public notify_content getContent() {
		return content;
	}

	public void setContent(notify_content content) {
		this.content = content;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Boolean getInApp() {
		return inApp;
	}

	public void setInApp(Boolean inApp) {
		this.inApp = inApp;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getTo() {
		return to;
	}

	public void setTo(List<String> to) {
		this.to = to;
	}
}