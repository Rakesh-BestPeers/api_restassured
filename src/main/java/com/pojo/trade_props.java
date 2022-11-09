package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class trade_props {
	public trade_props(List<Integer> propIds) {
		super();
		this.propIds = propIds;
	}

	private List<Integer> propIds = new ArrayList<Integer>();

	public List<Integer> getPropIds() {
		return propIds;
	}

	public void setPropIds(List<Integer> propIds) {
		this.propIds = propIds;
	}
}