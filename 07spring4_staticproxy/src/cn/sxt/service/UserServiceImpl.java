package cn.sxt.service;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		//������ҵ��--��־����ȫ��Ȩ�ޣ����棬����ȵ�
		//a.log();���������ȡ�--�����˼��;osgi--javaģ�鿪��
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
