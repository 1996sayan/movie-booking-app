package com.movie.user.vo;

import java.util.HashSet;
import java.util.Set;

import com.movie.user.entity.Role;

public class UserDto {
	private String name;
	private String username;

	private String email;

	private String password;

	private Set<Role> roles = new HashSet<>();

}
