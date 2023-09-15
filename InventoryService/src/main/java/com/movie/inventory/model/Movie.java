package com.movie.inventory.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

	@Id
	@Column(name = "movie_id")
	private long movieId;

	private String movie_name;

	private String genre;

	
	@ElementCollection(targetClass = String.class)
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

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Cast getCast() {
		return cast;
	}

	public void setCast(Cast cast) {
		this.cast = cast;
	}

	public Crew getCrew() {
		return crew;
	}

	public void setCrew(Crew crew) {
		this.crew = crew;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public SocialMedia getSocialMediaLink() {
		return socialMediaLink;
	}

	public void setSocialMediaLink(SocialMedia socialMediaLink) {
		this.socialMediaLink = socialMediaLink;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
