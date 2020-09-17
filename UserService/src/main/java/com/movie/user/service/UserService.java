package com.movie.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.user.entity.User;

@Service
public interface UserService {

	public String adduser();

	public List<User> getAllUser();
}
