package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class groups_gameIds {
	public groups_gameIds(List<String> gameIds) {
		super();
		this.gameIds = gameIds;
	}

	private List<String> gameIds = new ArrayList<String>();

	public List<String> getGameIds() {
		return gameIds;
	}

	public void setGameIds(List<String> gameIds) {
		this.gameIds = gameIds;
	}
}