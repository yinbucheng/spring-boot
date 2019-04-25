package sample.freemarker.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestBean
 * @Author buchengyin
 * @Date 2019/4/25 14:02
 **/
@Component
public class TestBean {
	public void test(){
		System.out.println("test");
	}
}
