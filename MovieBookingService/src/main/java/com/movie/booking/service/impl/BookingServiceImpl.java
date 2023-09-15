package com.movie.booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.QueryTimeoutException;

import org.hibernate.exception.DataException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.booking.constant.MovieBookingExceptionConstant;
import com.movie.booking.dao.BookingDao;
import com.movie.booking.exception.DatabaseException;
import com.movie.booking.exception.RecordAlreadyExistsException;
import com.movie.booking.exception.RecordNotFoundException;
import com.movie.booking.exception.ShowNotFoundException;
import com.movie.booking.model.Booking;
import com.movie.booking.proxy.UserServiceProxy;
import com.movie.booking.service.BookingService;
import com.movie.booking.util.BeanUtil;
import com.movie.booking.vo.BookingRequestVo;
import com.movie.booking.vo.BookingResponseVo;
import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.ShowResponseVo;
import com.movie.booking.vo.UserDetailsResponseVo;

import antlr.StringUtils;

@Service
public class BookingServiceImpl implements BookingService {

	/**
	 * bookingRepository
	 */
	@Autowired
	BookingDao bookingRepository;
	
	@Autowired
	private UserServiceProxy userFeignClient;
	

	/**
	 * 
	 * @param request
	 * @param showResponse
	 * @param userResponse
	 * @return ResponseObject<BookingResponseVo>
	 * @throws ShowNotFoundException
	 * @throws RecordNotFoundException
	 * @throws RecordAlreadyExistsException
	 */
	@Override
	public ResponseObject<BookingResponseVo> performMovieBooking(String bearerToken,BookingRequestVo request)
			throws ShowNotFoundException, RecordNotFoundException, RecordAlreadyExistsException {
		
		
		// Alert: Need to call other service to validate the show response and the user response
		
/*		
		if (userResponse.getStatusCode() != 200) {
			throw new RecordNotFoundException(MovieBookingExceptionConstant.USER_NOT_REGISTERED);
		}
		if (showResponse.getStatusCode() != 200) {
			throw new ShowNotFoundException(MovieBookingExceptionConstant.SHOW_NOT_EXIST);
		}

		if (showResponse.getData().getScreen().getSeatList().stream()
				.anyMatch(seatNumber -> request.getSeatNumber().contains(seatNumber.getSeatNumber()))) {
			throw new RecordNotFoundException(MovieBookingExceptionConstant.SEAT_NOT_EXIST);
		}
		*/
		
		
		ResponseObject<UserDetailsResponseVo> userResponse=userFeignClient.getUserDetails(bearerToken,request.getUsername());
		
		if(userResponse==null) {
			throw new RecordNotFoundException(MovieBookingExceptionConstant.USER_NOT_REGISTERED);
		}

		
		
		if (bookingRepository.isSeatPresent(request.getSeatNumber())) {
			throw new RecordAlreadyExistsException(MovieBookingExceptionConstant.SEAT_ALREADY_BOOKED);
		}
		Booking booking = (Booking) BeanUtil.getModelMapper().map(request, Booking.class);
		booking = bookingRepository.saveAndFlush(booking);

		ResponseObject<BookingResponseVo> response = new ResponseObject<BookingResponseVo>();
	//	response.setData((BookingResponseVo) BeanUtil.copyProperties(booking, BookingResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage(MovieBookingExceptionConstant.BOOKING_SUCCESS);
		return response;
	}

	/**
	 * 
	 * @return ResponseObject<List<BookingResponseVo>>
	 * @throws RecordNotFoundException
	 * @throws DatabaseException
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ResponseObject<List<BookingResponseVo>> getAllBookings() throws RecordNotFoundException, DatabaseException {
		List<Booking> bookingList = new ArrayList<Booking>();
		try {
			bookingList = bookingRepository.findAll();
			if (bookingList.isEmpty()) {
				throw new RecordNotFoundException(MovieBookingExceptionConstant.NO_ENTRY_FOUND);
			}
		} catch (DataException | JDBCConnectionException | QueryTimeoutException e) {
			throw new DatabaseException(e);
		}
		ResponseObject<List<BookingResponseVo>> response = new ResponseObject<List<BookingResponseVo>>();
		response.setData((List<BookingResponseVo>) BeanUtil.copyListOfProperties(bookingList, BookingResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage(MovieBookingExceptionConstant.ALL_BOOKING_ENTRIES_RECEIVED);
		return response;
	}

	/**
	 * 
	 * @param bookingId
	 * @return ResponseObject<BookingResponseVo>
	 * @throws RecordNotFoundException
	 * @throws DatabaseException
	 */
	@Override
	public ResponseObject<BookingResponseVo> getBookingByBookingId(long bookingId)
			throws RecordNotFoundException, DatabaseException {
		Booking booking = new Booking();
		try {

			booking = bookingRepository.findById(bookingId).get();
			if (booking == null) {
				throw new RecordNotFoundException(MovieBookingExceptionConstant.NO_PARTICULAR_ENTRY_PRESENT);
			}
		} catch (DataException | JDBCConnectionException | QueryTimeoutException e) {
			throw new DatabaseException(e);
		}

		ResponseObject<BookingResponseVo> response = new ResponseObject<BookingResponseVo>();
		response.setData((BookingResponseVo) BeanUtil.getModelMapper().map(booking, BookingResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage(MovieBookingExceptionConstant.BOOKING_ENTRY_CORRESPONDING_TO_BOOKINGID
				+ MovieBookingExceptionConstant.SINGLE_SPACE + "=>" + bookingId+" "
				+ MovieBookingExceptionConstant.HAS_BEEN_RETRIEVED);
		return response;
	}

}
