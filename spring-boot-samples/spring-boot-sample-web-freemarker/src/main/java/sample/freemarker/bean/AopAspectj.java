package sample.freemarker.bean;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName AopAspectj
 * @Author buchengyin
 * @Date 2019/4/25 19:50
 **/
@Aspect
public class AopAspectj {

	@Before("execution(* *..bean.*.*(..))")
	public void test(){
		System.out.println("------------>before--------");
	}
}
