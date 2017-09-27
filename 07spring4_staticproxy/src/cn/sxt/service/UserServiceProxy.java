package cn.sxt.service;

public class UserServiceProxy implements UserService {
	private UserService userService;

	@Override
	public void add() {
		log("add");
		userService.add();
	}

	@Override
	public void uodate() {
		log("update");
		userService.uodate();
	}

	@Override
	public void delete() {
		log("delete");
		userService.delete();
	}

	@Override
	public void seacher() {
		log("seacher method");
		userService.seacher();
	}

	public void log(String methodName) {
		System.out.println("acting " + methodName + " method");
	}

}
