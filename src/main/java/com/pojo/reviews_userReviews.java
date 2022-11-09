package com.pojo;

public class reviews_userReviews {
	public reviews_userReviews(String review, String reviewTimestamp) {
		super();
		this.review = review;
		this.reviewTimestamp = reviewTimestamp;
	}

	private String review;
	private String reviewTimestamp;

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReviewTimestamp() {
		return reviewTimestamp;
	}

	public void setReviewTimestamp(String reviewTimestamp) {
		this.reviewTimestamp = reviewTimestamp;
	}
}