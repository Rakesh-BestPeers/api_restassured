package com.pojo;

public class reports_gameReport {
	public reports_gameReport(String from, String subject, String body) {
		super();
		this.from = from;
		this.subject = subject;
		this.body = body;
	}

	private String from;
	private String subject;
	private String body;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
