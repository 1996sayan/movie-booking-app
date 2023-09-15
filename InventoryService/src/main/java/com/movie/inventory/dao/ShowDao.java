package com.movie.inventory.dao;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.inventory.model.Show;

@Repository
public interface ShowDao extends JpaRepository<Show, Long> {

	Show findByscreenIdAndShowDateAndShowTimeAndShowLanguage(long screenId, LocalDate showDate, LocalTime showTime,
			String showLanguage);
}
