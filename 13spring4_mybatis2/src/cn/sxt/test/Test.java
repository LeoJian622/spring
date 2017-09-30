package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.dao.UserDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		System.err.println(userDao.selectUsers().size());
	}
}
