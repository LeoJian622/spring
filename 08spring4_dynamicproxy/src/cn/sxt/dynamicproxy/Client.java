package cn.sxt.dynamicproxy;


import java.util.ArrayList;
import java.util.List;

import cn.sxt.service.UserService;
import cn.sxt.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
		//dynamic����ʵ��--�ⷿ
		Host host = new Host();
		ProxyInovationHandler proxyInovationHandler1 = new ProxyInovationHandler();
		proxyInovationHandler1.setTarget(host);
		Rent proxy1 = (Rent)proxyInovationHandler1.getProxy();
		proxy1.rent();
		//dynamic����ʵ��--���ݲ���
		UserService userService = new UserServiceImpl();
		ProxyInovationHandler proxyInovationHandler2 = new ProxyInovationHandler();
		proxyInovationHandler2.setTarget(userService);
		UserService proxy2 = (UserService)proxyInovationHandler2.getProxy();
		proxy2.add();
		proxy2.delete();
		
		//dynamic����ʵ��--List��
		ProxyInovationHandler proxyInovationHandler3 = new ProxyInovationHandler();
		proxyInovationHandler3.setTarget(new ArrayList());
		List proxy3 = (List)proxyInovationHandler3.getProxy();
		proxy3.add("test!");
	}
}
