package com.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.platform.dao.inter.IUserDao;
import com.platform.service.inter.IUserService;
import com.platform.vo.User;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	@Qualifier("iUserDao")
	private IUserDao iUserDao;
	
	@Override
	public User findUserInfo() {
		return iUserDao.findUserInfo();
	}

}
