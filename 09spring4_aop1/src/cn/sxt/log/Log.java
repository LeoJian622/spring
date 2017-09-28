package cn.sxt.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice {
	/**
	 * @param method �����÷�������
	 * @param args �����÷����Ĳ���
	 * @param target Ŀ�����
	 * */
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println(target.getClass().getName()+"��"+method.getName()+"������ִ��");
	}

}
