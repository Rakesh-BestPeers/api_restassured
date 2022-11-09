package com.pojo;

public class games_gamsSorting {
	public games_gamsSorting(String date, String timezone, String direction, String league, String teamId) {
		super();
		this.date = date;
		this.timezone = timezone;
		this.direction = direction;
		this.league = league;
		this.teamId = teamId;
	}

	private String date;
	private String timezone;
	private String direction;
	private String league;
	private String teamId;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
}