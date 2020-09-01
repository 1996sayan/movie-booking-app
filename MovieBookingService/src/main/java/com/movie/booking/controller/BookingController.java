package com.movie.booking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.booking.constant.MovieBookingConstant;
import com.movie.booking.exception.DatabaseException;
import com.movie.booking.exception.RecordAlreadyExistsException;
import com.movie.booking.exception.RecordNotFoundException;
import com.movie.booking.exception.ShowNotFoundException;
import com.movie.booking.proxy.ShowServiceProxy;
import com.movie.booking.proxy.UserServiceProxy;
import com.movie.booking.service.BookingService;
import com.movie.booking.vo.BookingRequestVo;
import com.movie.booking.vo.BookingResponseVo;
import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.ShowResponseVo;
import com.movie.booking.vo.UserDetailsResponseVo;

@RestController
@RequestMapping(value = MovieBookingConstant.BOOKING, produces = MediaType.APPLICATION_JSON_VALUE)
public class BookingController {
	/**
	 * bookingService
	 */
	@Autowired
	BookingService bookingService;

	/**
	 * userServiceProxy
	 */
	@Autowired
	UserServiceProxy userServiceProxy;

	/**
	 * showServiceProxy
	 */
	@Autowired
	ShowServiceProxy showServiceProxy;

	/**
	 * 
	 * @param request
	 * @return
	 * @throws ShowNotFoundException
	 * @throws RecordNotFoundException
	 * @throws RecordAlreadyExistsException
	 */
	@RequestMapping(method = RequestMethod.POST, value = MovieBookingConstant.MOVIE_BOOK)
	public ResponseObject<BookingResponseVo> performMovieBooking(@Valid @RequestBody BookingRequestVo request)
			throws ShowNotFoundException, RecordNotFoundException, RecordAlreadyExistsException {
		ResponseObject<ShowResponseVo> showResponse = showServiceProxy.getShowResponse();
		ResponseObject<UserDetailsResponseVo> userResponse = userServiceProxy.getUserDetails();
		ResponseObject<BookingResponseVo> response = bookingService.performMovieBooking(request, showResponse,
				userResponse);
		return response;
	}

	/**
	 * 
	 * @return
	 * @throws RecordNotFoundException
	 * @throws DatabaseException
	 */
	@RequestMapping(method = RequestMethod.GET, value = MovieBookingConstant.GET_BOOKING)
	public ResponseObject<List<BookingResponseVo>> getAllBooking() throws RecordNotFoundException, DatabaseException {
		return bookingService.getAllBookings();
	}

	/**
	 * 
	 * @param bookingId
	 * @return
	 * @throws RecordNotFoundException
	 * @throws DatabaseException
	 */
	@RequestMapping(method = RequestMethod.GET, value = MovieBookingConstant.GET_BOOKING_BY_ID)
	public ResponseObject<BookingResponseVo> getBookingEntry(@PathVariable long bookingId)
			throws RecordNotFoundException, DatabaseException {
		return bookingService.getBookingByBookingId(bookingId);
	}
}
