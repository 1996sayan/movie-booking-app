package com.movie.booking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movie.booking.model.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long> {

	@Query(value = "SELECT CASE WHEN EXISTS (SELECT * FROM db.Booking WHERE seat_number in ? 1) THEN 'TRUE' ELSE 'FALSE' END", nativeQuery = true)
	public boolean isSeatPresent(List<String> seatList);
}
