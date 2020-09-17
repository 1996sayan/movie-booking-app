package com.movie.user.service.impl;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.user.constant.UserServiceConstant;
import com.movie.user.dao.RoleRepository;
import com.movie.user.dao.UserRepository;
import com.movie.user.entity.Role;
import com.movie.user.entity.RoleName;
import com.movie.user.entity.User;
import com.movie.user.exception.UserRegistractionException;
import com.movie.user.service.UserRegistrationService;
import com.movie.user.service.UserServicePasswordEncoder;
import com.movie.user.util.BeanUtil;
import com.movie.user.vo.ResponseObject;
import com.movie.user.vo.SignUpRequestVo;
import com.movie.user.vo.UserRegistrationResponseVo;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	UserServicePasswordEncoder userServicePasswordEncoder;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public ResponseObject<UserRegistrationResponseVo> addUser(@Valid SignUpRequestVo signUpRequest)
			throws UserRegistractionException {

		User user = new User(signUpRequest.getName(), signUpRequest.getUsername(), signUpRequest.getEmail(),
				userServicePasswordEncoder.encode(signUpRequest.getPassword()));
		Set<String> strRoles = signUpRequest.getRole();
		Set<Role> roles = new HashSet<>();

		strRoles.forEach(role -> {
			Random rand = new Random();
			switch (role) {
			case UserServiceConstant.ADMIN:
				Role adminRole = new Role(rand.nextLong(), RoleName.ROLE_ADMIN);
				roles.add(adminRole);

				break;
			case UserServiceConstant.PM:
				Role pmRole = new Role(rand.nextLong(), RoleName.ROLE_PM);
				roles.add(pmRole);
				break;
			default:
				Role userRole = new Role(rand.nextLong(), RoleName.ROLE_USER);
				roles.add(userRole);
			}
		});

		user.setRoles(roles);
		user = userRepository.saveAndFlush(user);
		ResponseObject<UserRegistrationResponseVo> response = new ResponseObject<UserRegistrationResponseVo>();
		response.setData((UserRegistrationResponseVo) BeanUtil.copyPropWithAmbuiguityIgnore(user,
				UserRegistrationResponseVo.class));
		response.setUserMessage("Sign Up Success");
		response.setStatusCode(200);
		return response;

	}

}
