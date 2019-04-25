package sample.freemarker;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import sample.freemarker.bean.TestBean;

/**
 * @ClassName ClassPathBeanDefinitionScannerTest
 * @Author buchengyin
 * @Date 2019/4/25 14:01
 **/
public class ClassPathBeanDefinitionScannerTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory iocFactory = new DefaultListableBeanFactory();
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(iocFactory);
		scanner.scan("sample.freemarker.bean");
		TestBean bean = iocFactory.getBean(TestBean.class);
		bean.test();
	}
}
