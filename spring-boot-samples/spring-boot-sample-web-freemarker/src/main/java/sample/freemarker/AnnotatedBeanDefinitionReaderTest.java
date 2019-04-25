package sample.freemarker;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import sample.freemarker.bean.ConfigurationClass;
import sample.freemarker.bean.TestBean;

/**
 * @ClassName AnnotatedBeanDefinitionReaderTest
 * @Author buchengyin
 * @Date 2019/4/25 15:01
 **/
public class AnnotatedBeanDefinitionReaderTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory iocFactory = new DefaultListableBeanFactory();
		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(iocFactory);
		reader.register(ConfigurationClass.class);
		//这里需要手动调用register才能保证注册到ioc容器中
//		reader.register(TestBean.class);
		TestBean bean = iocFactory.getBean(TestBean.class);
		bean.test();
	}
}
