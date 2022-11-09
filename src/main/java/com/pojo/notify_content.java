package com.pojo;

public class notify_content {
	  public notify_content(String category, String data, String message) {
		super();
		this.category = category;
		this.data = data;
		this.message = message;
	}
	private String category;
	    private String data;
	    private String message;
	    public String getCategory() {
	        return category;
	    }
	    public void setCategory(String category) {
	        this.category = category;
	    }
	    public String getData() {
	        return data;
	    }
	    public void setData(String data) {
	        this.data = data;
	    }
	    public String getMessage() {
	        return message;
	    }
	    public void setMessage(String message) {
	        this.message = message;
	    }
}