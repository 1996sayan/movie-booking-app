package com.movie.user.vo;

import java.util.HashSet;
import java.util.Set;

import com.movie.user.entity.Role;



public class UserRegistrationResponseVo {
	private String name;
	private String username;
	private String email;
	private Set<Role> roles = new HashSet<>();
}
