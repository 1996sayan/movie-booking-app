package com.movie.user.entity;

import javax.persistence.Id;

import lombok.Data;

@Data
public class DataBaseSequence {

	@Id
	private int id;
	private long seq;

}
