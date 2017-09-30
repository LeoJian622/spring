package cn.sxt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		List<User> list = userDao.getAll();
		System.out.println(list);
	}
}
