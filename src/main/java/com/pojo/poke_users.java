package com.pojo;

public class poke_users {
	public poke_users(String groupId, String gameId, String loginUserId) {
		super();
		this.groupId = groupId;
		this.gameId = gameId;
		this.loginUserId = loginUserId;
	}

	private String groupId;
	private String gameId;
	private String loginUserId;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}
}