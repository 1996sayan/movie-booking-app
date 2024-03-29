package com.movie.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.inventory.model.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Long>{

}
