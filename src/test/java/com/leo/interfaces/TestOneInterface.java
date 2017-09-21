package test.java.com.leo.interfaces;

import main.java.com.leo.interfaces.Oneinterface;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import test.java.com.leo.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {

	public TestOneInterface() {
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testSay() {
		Oneinterface oneInterface = super.getBean("oneInterface");
		oneInterface.hello("This is a test.");
	}

}
