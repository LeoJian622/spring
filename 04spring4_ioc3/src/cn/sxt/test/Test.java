package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.User;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		User user = (User) applicationContext.getBean("user1");
		user.show();
		User user1 = (User) applicationContext.getBean("u1");
		user1.show();
		User user2= (User) applicationContext.getBean("u2");
		user2.show();
		User user3 = (User) applicationContext.getBean("u3");
		user3.show();
		User user4 = (User) applicationContext.getBean("u4");
		user4.show();
		User user5 = (User) applicationContext.getBean("u5");
		user5.show();
	}
}
