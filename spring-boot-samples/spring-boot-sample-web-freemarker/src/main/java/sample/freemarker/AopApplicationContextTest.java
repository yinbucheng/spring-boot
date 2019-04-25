package sample.freemarker;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.freemarker.bean.AopAspectj;
import sample.freemarker.bean.ConfigurationClass;
import sample.freemarker.bean.TestBean;

/**
 * @ClassName AopApplicationContextTest
 * @Author buchengyin
 * @Date 2019/4/25 19:48
 **/
public class AopApplicationContextTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory iocFactory = new DefaultListableBeanFactory();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(iocFactory);
		context.register(AnnotationAwareAspectJAutoProxyCreator.class);
		context.register(AopAspectj.class);
		context.register(ConfigurationClass.class);
		context.refresh();
		TestBean bean = context.getBean(TestBean.class);
		bean.test();
	}
}
