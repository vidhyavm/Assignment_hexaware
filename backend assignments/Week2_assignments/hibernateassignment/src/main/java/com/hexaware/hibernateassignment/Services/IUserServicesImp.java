package com.hexaware.hibernateassignment.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.hibernateassignment.Dao.IUserDaoImp;
import com.hexaware.hibernateassignment.Entity.User;

@Service
public class IUserServicesImp implements IUserServices {

	IUserDaoImp dao=new IUserDaoImp();
	
	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return dao.createUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return dao.updateUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return dao.deleteUser(user);
	}
	@Override
	public User getUserById(int user_id) {
		// TODO Auto-generated method stub
		return dao.getUserById(user_id);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return dao.getAllUser();
	}

}
