package com.movie.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.booking.model.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long> {

	@Query(value = "SELECT CASE WHEN EXISTS (SELECT * FROM Booking WHERE seat_number  = :seatNumber) THEN 'TRUE' ELSE 'FALSE' END", nativeQuery = true)
	public boolean isSeatPresent(@Param("seatNumber") String seatNumber);
}
