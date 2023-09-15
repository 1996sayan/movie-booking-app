package com.movie.booking.vo;

import java.time.LocalDate;




public class MovieResponseVo {

	private long movieId;

	private String movieTitle;

	private double rating;

	private LocalDate releaseDate;

	private String directorName;

	private String producer;

	private String genre;

	private String language;

	private String movieImageUrl;

	public MovieResponseVo(long movieId, String movieTitle, double rating, LocalDate releaseDate, String directorName,
			String producer, String genre, String language, String movieImageUrl) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.directorName = directorName;
		this.producer = producer;
		this.genre = genre;
		this.language = language;
		this.movieImageUrl = movieImageUrl;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMovieImageUrl() {
		return movieImageUrl;
	}

	public void setMovieImageUrl(String movieImageUrl) {
		this.movieImageUrl = movieImageUrl;
	}
	
	
}
