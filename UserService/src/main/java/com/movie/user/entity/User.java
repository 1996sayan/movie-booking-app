package com.movie.user.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
	@Id
	@Column(name = "user_name")
	private String userName;
	private String name;
	private String email;
	private String password;
	private Set<Role> roles = new HashSet<>();

	public User(String userName, String name, String email, String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.email = email;
		this.password = password;
	}

}
