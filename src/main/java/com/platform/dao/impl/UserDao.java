package com.platform.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.inter.IUserDao;
import com.platform.mapper.UserMapper;
import com.platform.vo.User;

@Service("iUserDao")
public class UserDao implements IUserDao{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserInfo() {
		return userMapper.findUserInfo();
	}
	
	
}
