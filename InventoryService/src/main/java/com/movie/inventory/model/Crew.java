package com.movie.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

	public Crew() {
		// TODO Auto-generated constructor stub
	}

	public long getCrewId() {
		return crewId;
	}

	public void setCrewId(long crewId) {
		this.crewId = crewId;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musician) {
		this.musician = musician;
	}

	public String getStoryWriter() {
		return storyWriter;
	}

	public void setStoryWriter(String storyWriter) {
		this.storyWriter = storyWriter;
	}

}
