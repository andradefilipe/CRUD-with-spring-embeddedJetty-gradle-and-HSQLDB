package com.andrade.dao;

import java.util.List;

import com.andrade.model.User;

public interface UserDao {

	User findByName(String name);

	List<User> findAll();

}