package cn.sxt.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice {
	/**
	 * @param method 被调用方法对象
	 * @param args 被调用方法的参数
	 * @param target 目标对象
	 * */
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行");
	}

}
