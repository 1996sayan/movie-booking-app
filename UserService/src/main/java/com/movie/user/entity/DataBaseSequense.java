package com.movie.user.entity;

import org.springframework.data.annotation.Id;

public class DataBaseSequense {

	@Id
	private int id;
	private long seq;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

}
