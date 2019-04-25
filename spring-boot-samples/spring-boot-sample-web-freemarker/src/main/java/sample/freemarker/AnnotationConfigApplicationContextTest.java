package sample.freemarker;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.freemarker.bean.ConfigurationClass;
import sample.freemarker.bean.TestBean;

/**
 * @ClassName AnnotationConfigApplicationContextTest
 * @Author buchengyin
 * @Date 2019/4/25 14:05
 **/
public class AnnotationConfigApplicationContextTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory iocBeanFactory = new DefaultListableBeanFactory();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(iocBeanFactory);
		context.register(ConfigurationClass.class);
		context.refresh();
		TestBean bean = context.getBean(TestBean.class);
		bean.test();
	}
}
