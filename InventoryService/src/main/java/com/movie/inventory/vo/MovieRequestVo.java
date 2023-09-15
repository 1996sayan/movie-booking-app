package com.movie.inventory.vo;

import java.sql.Date;
import java.util.List;

public class MovieRequestVo {

//	private long movieId;

	private String movie_name;

	private String genre;

	private List<String> languages;

	private List<String> actorName;

	private List<String> actressName;

	private String director;

	private String producer;

	private String musician;

	private String storyWriter;

	private String synopsis;

	private String trailer;

	private String facebook;

	private String instagram;

	private String twitter;

	private String rotten_tomatoes;

	private String userName;

	private String comments;

	private double rating;

	private Date releaseDate;

	private double duration;

//	public long getMovieId() {
//		return movieId;
//	}
//
//	public void setMovieId(long movieId) {
//		this.movieId = movieId;
//	}

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

	public List<String> getActorName() {
		return actorName;
	}

	public void setActorName(List<String> actorName) {
		this.actorName = actorName;
	}

	public List<String> getActressName() {
		return actressName;
	}

	public void setActressName(List<String> actressName) {
		this.actressName = actressName;
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

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getRotten_tomatoes() {
		return rotten_tomatoes;
	}

	public void setRotten_tomatoes(String rotten_tomatoes) {
		this.rotten_tomatoes = rotten_tomatoes;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
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
