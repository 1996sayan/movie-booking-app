package com.movie.inventory.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "movie")
@Data
public class Movie {

	@Id
	@Column(name = "movie_id")
	private long movieId;

	private String movie_name;

	private List<String> genres;

	private List<String> languages;

	@OneToOne(cascade = CascadeType.ALL)
	private Cast cast;

	@OneToOne(cascade = CascadeType.ALL)
	private Crew crew;

	private String synopsis;

	private String trailer;

	@OneToOne(cascade = CascadeType.ALL)
	private SocialMedia socialMediaLink;

	@OneToOne(cascade = CascadeType.ALL)
	private Review review;

	private Date releaseDate;

	private double duration;
}
