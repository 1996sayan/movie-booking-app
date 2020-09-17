package com.movie.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Crew {

	@Id
	@Column(name = "crew_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long crewId;

	private String director;

	private String producer;

	private String musician;

	@Column(name = "story_writer")
	private String storyWriter;
}
