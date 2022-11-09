package com.pojo;

public class users_rewardClaim_root {
	public users_rewardClaim_root(Integer coins, users_rewardClaim meta) {
		super();
		this.coins = coins;
		this.meta = meta;
	}

	private Integer coins;
	private users_rewardClaim meta;

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}

	public users_rewardClaim getMeta() {
		return meta;
	}

	public void setMeta(users_rewardClaim meta) {
		this.meta = meta;
	}
}