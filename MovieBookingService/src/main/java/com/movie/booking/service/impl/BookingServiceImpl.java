package com.movie.booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.booking.dao.BookingDao;
import com.movie.booking.exception.DatabaseException;
import com.movie.booking.exception.RecordAlreadyExistsException;
import com.movie.booking.exception.RecordNotFoundException;
import com.movie.booking.exception.ShowNotFoundException;
import com.movie.booking.model.Booking;
import com.movie.booking.service.BookingService;
import com.movie.booking.util.BeanUtil;
import com.movie.booking.vo.BookingRequestVo;
import com.movie.booking.vo.BookingResponseVo;
import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.ShowResponseVo;
import com.movie.booking.vo.UserDetailsResponseVo;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingRepository;

	@Override
	public ResponseObject<BookingResponseVo> performMovieBooking(BookingRequestVo request,
			ResponseObject<ShowResponseVo> showResponse, ResponseObject<UserDetailsResponseVo> userResponse)
			throws ShowNotFoundException, RecordNotFoundException, RecordAlreadyExistsException {
		if (userResponse.getStatusCode() != 200) {
			throw new RecordNotFoundException("User not registered");
		}
		if (showResponse.getStatusCode() != 200) {
			throw new ShowNotFoundException("Show does not exist");
		}

		if (showResponse.getData().getScreen().getSeatList().stream()
				.anyMatch(seatNumber -> request.getSeatNumber().contains(seatNumber.getSeatNumber()))) {
			throw new RecordNotFoundException("Seat not present");
		}

		if (bookingRepository.isSeatPresent(request.getSeatNumber())) {
			throw new RecordAlreadyExistsException("Seat already booked");
		}
		Booking booking = (Booking) BeanUtil.copyProp(request, Booking.class);
		booking = bookingRepository.saveAndFlush(booking);

		ResponseObject<BookingResponseVo> response = new ResponseObject<BookingResponseVo>();
		response.setData((BookingResponseVo) BeanUtil.copyProperties(booking, BookingResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage("Booking Successful");
		return response;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResponseObject<List<BookingResponseVo>> getAllBookings() throws RecordNotFoundException, DatabaseException {
		List<Booking> bookingList = new ArrayList<Booking>();
		bookingList = bookingRepository.findAll();
		if (bookingList.isEmpty()) {

		}
		ResponseObject<List<BookingResponseVo>> response = new ResponseObject<List<BookingResponseVo>>();
		response.setData((List<BookingResponseVo>) BeanUtil.copyListOfProperties(bookingList, BookingResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage("All booking entries received");
		return response;
	}

	@Override
	public ResponseObject<BookingResponseVo> getBookingByBookingId(long bookingId)
			throws RecordNotFoundException, DatabaseException {
		Booking booking = new Booking();
		if (!bookingRepository.existsById(bookingId)) {

		}
		bookingRepository.getOne(bookingId);

		ResponseObject<BookingResponseVo> response = new ResponseObject<BookingResponseVo>();
		response.setData((BookingResponseVo) BeanUtil.copyProperties(booking, BookingResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage("Booking entrty corresponding to bookingId =>" + bookingId + "has been retrieved");
		return response;
	}

}
