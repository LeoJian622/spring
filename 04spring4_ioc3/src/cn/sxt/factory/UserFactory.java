package cn.sxt.factory;

import cn.sxt.vo.User;

public class UserFactory {//通过工厂方法创建对象：静态工厂
	public static User newInstance(String name){
		return new User(name);
	}
}
