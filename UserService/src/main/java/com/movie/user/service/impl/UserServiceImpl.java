package com.movie.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.user.dao.UserRepository;
import com.movie.user.entity.User;
import com.movie.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userDaoInterface;

	@Override
	public String adduser() {
		// User userobj = new User("Sayan", "Mondal", "abc@mindtree.com", "7059664120",
		// "sayan123", "sayan123", "admin");

//		User userObj = new User();
//		userObj.setFirstName("Sayan");
//		userObj.setLastName("Mondal");
//		List<UserPreference> preferences = new ArrayList<>();
//		UserPreference userPreference = new UserPreference();
//		Preference prefrenceId = new Preference();
//		prefrenceId.setName("English");
//		userPreference.setPrefrenceId(prefrenceId);
//		List<String> values = new ArrayList<String>();
//		values.add("Comics");
//		values.add("Action");
//		values.add("Love");
//		userPreference.setValues(values);
//		preferences.add(userPreference);
//		userPreference.setUser(userObj);
//		prefrenceId.setUserPreference(userPreference);
//		userObj.setPreferences(preferences);
//		userDaoInterface.save(userObj);
		return "Done";
	}

	@Override
	public List<User> getAllUser() {
		return null;
		// return (List<User>) userDaoInterface.findAll();
	}

}
