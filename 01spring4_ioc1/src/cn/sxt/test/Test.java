package cn.sxt.test;

import cn.sxt.dao.impl.UserDaoMysqlImpl;
import cn.sxt.dao.impl.UserDaoOracleImpl;
import cn.sxt.service.impl.UserServiceImpl;

public class Test {
	public static void main(String[] args){
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.setUserDao(new UserDaoMysqlImpl());
		userServiceImpl.getUser();
		userServiceImpl.setUserDao(new UserDaoOracleImpl());
		System.out.println("------------------------");
		userServiceImpl.getUser();
	}
}
