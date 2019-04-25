package sample.freemarker;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import sample.freemarker.bean.TestBean;

/**
 * @ClassName AopEasyTest
 * @Author buchengyin
 * @Date 2019/4/25 20:05
 **/
public class AopEasyTest {
	public static void main(String[] args) {
		TestBean testBean = new TestBean();
		ProxyFactory proxyFactory = new ProxyFactory();
		//添加拦截器
		proxyFactory.addAdvice(new MethodInterceptor() {
			@Override
			public Object invoke(MethodInvocation methodInvocation) throws Throwable {
				System.out.println("---------------------->hahaha<-----------------------");
				return methodInvocation.proceed();
			}
		});
		proxyFactory.addAdvice(new MethodInterceptor() {
			@Override
			public Object invoke(MethodInvocation methodInvocation) throws Throwable {
				System.out.println("---------------------->lalala<-----------------------");
				return methodInvocation.proceed();
			}
		});
		//添加目标对象
		proxyFactory.setTarget(testBean);
		TestBean proxy = (TestBean)proxyFactory.getProxy();
		proxy.test();
	}
}
