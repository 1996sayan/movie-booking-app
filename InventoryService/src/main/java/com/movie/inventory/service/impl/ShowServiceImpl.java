package com.movie.inventory.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.inventory.dao.MovieDao;
import com.movie.inventory.dao.ShowDao;
import com.movie.inventory.model.Movie;
import com.movie.inventory.model.Show;
import com.movie.inventory.service.ShowService;
import com.movie.inventory.util.BeanUtil;
import com.movie.inventory.vo.ResponseObject;
import com.movie.inventory.vo.ShowRequestVo;
import com.movie.inventory.vo.ShowResponseVo;

@Service
public class ShowServiceImpl implements ShowService {

	/**
	 * showRepository
	 */
	@Autowired
	private ShowDao showRepository;

	@Autowired
	private MovieDao movieRepository;

	@Override
	public ResponseObject<ShowResponseVo> addShowDetails(ShowRequestVo request) {

		Movie movie = null;

		try {
			movie = movieRepository.findById(request.getMovieId())
					.orElseThrow(() -> new Exception(String.valueOf(request.getMovieId())));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Show show = null;

		try {
			show = showRepository.findByscreenIdAndShowDateAndShowTimeAndShowLanguage(request.getScreenId(),
					request.getShowDate(), request.getShowTime(), request.getShowLanguage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (show != null) {
			System.out.println("Neeed to throw a user message record already present");
		} else {
			show = new Show();
//			show.setShowDate(request.getShowDate());
//			show.setShowTime(request.getShowTime());
//			show.setShowDuration(request.getShowDuration());
//			show.setShowLanguage(request.getShowLanguage());
//			show.setMovie(movie);
//			show.setTickerPrice(request.getTickerPrice());
//			show.setSeats(request.getSeats());
//			show.setTotalSeats(request.getTotalSeats());
//			show.setTotalBookedSeats(0);
//			show.setTotalAvailableSeats(0);

			show = BeanUtil.getModelMapper().map(request, Show.class);

		}

		show = showRepository.save(show);

//		if (movieResponse.getStatusCode() != 200) {
//		}
//		if (screenResponse.getStatusCode() != 200) {
//		}
//
////		if (showResponse.getData().getScreen().getSeatList().stream()
////				.anyMatch(seatNumber -> request.getSeatNumber().contains(seatNumber.getSeatNumber()))) {
////			throw new RecordNotFoundException("Seat not Present");
////		}
////
////		if (bookingRepository.isSeatPresent(request.getSeatNumber())) {
////			throw new RecordAlreadyExistsException("seat already booked");
////		}
//
//		Show show = (Show) BeanUtil.copyProp(request, Show.class);
//		show = showRepository.saveAndFlush(show);

		ResponseObject<ShowResponseVo> response = new ResponseObject<ShowResponseVo>();
		response.setStatusCode(200);
		response.setUserMessage("Show details added");

		return response;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResponseObject<List<ShowResponseVo>> getAllShowDetails() {

		List<ShowResponseVo> allShowDetails = (List<ShowResponseVo>) BeanUtil.copyProperties(showRepository.findAll(),
				ShowResponseVo.class);
		ResponseObject<List<ShowResponseVo>> showResponse = new ResponseObject<>();
		showResponse.setData(allShowDetails);
		showResponse.setStatusCode(200);
		showResponse.setUserMessage("All show details retrieved");

		return showResponse;
	}

	@Override
	public ResponseObject<ShowResponseVo> getShowDetailsByShowId(long showId) {

		ResponseObject<ShowResponseVo> getShowDetailsById = new ResponseObject<>();
		ShowResponseVo showResponse = BeanUtil.getModelMapper().map(showRepository.findById(showId).get(),
				ShowResponseVo.class);
		getShowDetailsById.setData(showResponse);
		getShowDetailsById.setUserMessage("Show details retrieved");

		return getShowDetailsById;
	}

}
