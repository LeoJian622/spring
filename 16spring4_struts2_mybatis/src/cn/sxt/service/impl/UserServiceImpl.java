package cn.sxt.service.impl;

import java.util.List;

import cn.sxt.dao.UserDao;
import cn.sxt.service.UserService;
import cn.sxt.vo.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao = null;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
}
