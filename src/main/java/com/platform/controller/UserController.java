package com.platform.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.platform.service.inter.IUserService;
import com.platform.vo.User;

@Controller
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private IUserService userService;

	@RequestMapping("/getUserInfo")
	@ResponseBody
	public User getUserInfo() {
		User user = userService.findUserInfo();
		if (user != null) {
			System.out.println("user.getName():" + user.getStrUserNum());
		}
		return user;
	}
}
