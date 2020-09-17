package com.movie.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.inventory.model.Show;

@Repository
public interface ShowDao extends JpaRepository<Show, Long> {

}
