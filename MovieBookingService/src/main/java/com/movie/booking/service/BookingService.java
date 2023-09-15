package com.movie.booking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.booking.exception.DatabaseException;
import com.movie.booking.exception.RecordAlreadyExistsException;
import com.movie.booking.exception.RecordNotFoundException;
import com.movie.booking.exception.ShowNotFoundException;
import com.movie.booking.vo.BookingRequestVo;
import com.movie.booking.vo.BookingResponseVo;
import com.movie.booking.vo.ResponseObject;
import com.movie.booking.vo.ShowResponseVo;
import com.movie.booking.vo.UserDetailsResponseVo;

@Service
public interface BookingService {

	ResponseObject<BookingResponseVo> performMovieBooking(String bearerToken,BookingRequestVo request)
			throws ShowNotFoundException, RecordNotFoundException, RecordAlreadyExistsException;

	ResponseObject<List<BookingResponseVo>> getAllBookings() throws RecordNotFoundException, DatabaseException;

	ResponseObject<BookingResponseVo> getBookingByBookingId(long bookingId)
			throws RecordNotFoundException, DatabaseException;
}
