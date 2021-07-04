package com.batchprocessor.example.springbatch.jsonreader.model;

import java.sql.Timestamp;

public class BatchJsonEntry {
	private String id;
	private String state;
	private String host;
	private Timestamp timestamp;
	private String type;
	public String getHost() {
		return host;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public String getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "BatchJsonEntry [ID=" + id + ", STATE=" + state + "]" +", TIMESTAMP="
				+String.valueOf(timestamp) +", HOST="+host+", TYPE="+type;
	}
	
	
}
