package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.service.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.add();
		userService.uodate();
		userService.delete();
		userService.seacher();
	}
}
