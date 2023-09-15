package com.movie.inventory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.inventory.dao.MovieDao;
import com.movie.inventory.model.Cast;
import com.movie.inventory.model.Crew;
import com.movie.inventory.model.Movie;
import com.movie.inventory.model.Review;
import com.movie.inventory.model.SocialMedia;
import com.movie.inventory.service.MovieService;
import com.movie.inventory.vo.MovieRequestVo;
import com.movie.inventory.vo.MovieResponseVo;
import com.movie.inventory.vo.ResponseObject;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieRepo;

	@Override
	public ResponseObject<MovieResponseVo> addMovieDetails(MovieRequestVo request) {

		Movie movie = new Movie();
		movie.setMovieId(System.currentTimeMillis());
		movie.setMovie_name(request.getMovie_name());
		movie.setGenre(request.getGenre());
		movie.setLanguages(request.getLanguages());

		Cast cast = new Cast();
		cast.setActorName(request.getActorName());
		cast.setActressName(request.getActressName());
		movie.setCast(cast);

		Crew crew = new Crew();
		crew.setDirector(request.getDirector());
		crew.setMusician(request.getMusician());
		crew.setProducer(request.getProducer());
		crew.setStoryWriter(request.getStoryWriter());
		movie.setCrew(crew);

		movie.setSynopsis(request.getSynopsis());
		movie.setTrailer(request.getTrailer());

		SocialMedia socialMediaLink = new SocialMedia();
		socialMediaLink.setFacebook(request.getFacebook());
		socialMediaLink.setInstagram(request.getInstagram());
		socialMediaLink.setRotten_tomatoes(request.getRotten_tomatoes());
		socialMediaLink.setTwitter(request.getTwitter());
		movie.setSocialMediaLink(socialMediaLink);

		Review review = new Review();
		review.setComments(request.getComments());
		review.setRating(request.getRating());
		review.setUserName(request.getUserName());
		movie.setReview(review);

		movie.setReleaseDate(request.getReleaseDate());
		movie.setDuration(request.getDuration());

		movie = movieRepo.save(movie);

		MovieResponseVo movieBookingResponse = new MovieResponseVo();
		movieBookingResponse.setMovie_name(movie.getMovie_name());
		movieBookingResponse.setUserName(request.getUserName());

		ResponseObject<MovieResponseVo> movieResponse = new ResponseObject<>();
		movieResponse.setStatusCode(200);
		movieResponse.setData(movieBookingResponse);
		movieResponse.setUserMessage("success");

		return movieResponse;
	}

}
