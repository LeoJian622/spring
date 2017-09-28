package cn.sxt.service.impl;

import cn.sxt.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("---------add---------");
	}

	@Override
	public void uodate() {
		System.out.println("update");
	}

	@Override
	public int delete() {
		System.out.println("---------delete---------");
		return 1;
	}

	@Override
	public void seacher() {
		System.out.println("seacher");
	}

}
