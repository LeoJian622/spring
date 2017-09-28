package cn.sxt.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {
	/**
	 * Ŀ�귽��ִ�к�ִ�е�֪ͨ returnValue--����ֵ metho �����õķ��� args �����õķ���������� target
	 * �����õķ��������Ŀ�����
	 * */
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass().getName() + "��" + method.getName()
				+ "������ִ��,����ֵ��" + returnValue);
	}

}