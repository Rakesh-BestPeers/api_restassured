package com.pojo;

public class poke_user {
	public poke_user(String fromUserId, String toUserId, String gameId, String groupId) {
		super();
		this.fromUserId = fromUserId;
		this.toUserId = toUserId;
		this.gameId = gameId;
		this.groupId = groupId;
	}

	private String fromUserId;
	private String toUserId;
	private String gameId;
	private String groupId;

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getToUserId() {
		return toUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
}