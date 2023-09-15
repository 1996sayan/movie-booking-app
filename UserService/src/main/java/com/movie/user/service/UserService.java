package com.movie.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.user.entity.User;
import com.movie.user.vo.SignUpRequestVo;

@Service
public interface UserService {

	public String adduser(SignUpRequestVo request);

	public List<User> getAllUser();
}
