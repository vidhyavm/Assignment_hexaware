package com.hexaware.hibernateassignment.Dao;

import java.util.List;

import com.hexaware.hibernateassignment.Entity.User;

public interface IUserDao 
{
	public boolean createUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);

    public User getUserById(int user_id);
	
	public List<User> getAllUser();
}
