package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.vo.User;

public class Test {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		User user = (User) applicationContext.getBean("user");
		user.show();
	}
}
