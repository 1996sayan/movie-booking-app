package com.movie.user.service.impl;

import javax.persistence.QueryTimeoutException;

import org.hibernate.exception.DataException;
import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movie.user.dao.UserRepository;
import com.movie.user.model.User;
import com.movie.user.util.BeanUtil;
import com.movie.user.vo.ResponseObject;
import com.movie.user.vo.UserDetailsResponseVo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	private User getUser(String username) {
		User user = userRepository.findByUsername(username).orElseThrow(
				() -> new UsernameNotFoundException("User Not Found with -> username or email : " + username));
		return user;
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = getUser(username);

		return UserPrinciple.build(user);
	}

	public ResponseObject<UserDetailsResponseVo> getUserByUserId(String username) {
		User user = getUser(username);

		ResponseObject<UserDetailsResponseVo> response = new ResponseObject<UserDetailsResponseVo>();
		response.setData((UserDetailsResponseVo) BeanUtil.getModelMapper().map(user, UserDetailsResponseVo.class));
		response.setStatusCode(200);
		response.setUserMessage("Success message need to be printed");
		return response;
	}

}