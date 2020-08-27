package com.movie.booking.vo;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
}
