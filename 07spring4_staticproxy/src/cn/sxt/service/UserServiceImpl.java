package cn.sxt.service;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		//公共的业务--日志，安全，权限，缓存，事物等等
		//a.log();增加依赖等。--分离的思想;osgi--java模块开发
		System.out.println("add");
	}

	@Override
	public void uodate() {
		System.out.println("update");
	}

	@Override
	public void delete() {
		System.out.println("delete");
	}

	@Override
	public void seacher() {
		System.out.println("seacher");
	}

}
