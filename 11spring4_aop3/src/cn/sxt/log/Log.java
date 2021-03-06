package cn.sxt.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log{
	@Before("execution(* cn.sxt.service.impl.*.*(..))")
	public void before() {
		System.out.println("---------before---------");
	}
	@After("execution(* cn.sxt.service.impl.*.*(..))")
	public void after() {
		System.out.println("---------after----------");
	}
	@Around("execution(* cn.sxt.service.impl.*.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("------before around------");
		System.out.println("------signing："+proceedingJoinPoint.getSignature());
		//执行目标方法
		Object result = proceedingJoinPoint.proceed();
		System.out.println("------after around------");
		return result;
	}
}
