package com.qetch.springaop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qetch.springaop.entity.User;

@Mapper
public interface UserDao {

	public User getUserById(Integer id);
	
	public List<User> getAllUsers();
	
	public Integer saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
}
