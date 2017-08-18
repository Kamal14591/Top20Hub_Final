package com.kj.top20hub.dao;

import java.util.List;

import com.kj.top20hub.dto.User;

public interface UserDAO {
	
	public List<User> getAlluser();
	
	User getUser(int id);
}
