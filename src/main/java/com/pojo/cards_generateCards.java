package com.pojo;

public class cards_generateCards {
	public cards_generateCards(String gameId, Integer quantity) {
		super();
		this.gameId = gameId;
		this.quantity = quantity;
	}

	private String gameId;
	private Integer quantity;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
