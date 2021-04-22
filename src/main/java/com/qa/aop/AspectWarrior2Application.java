package com.qa.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.aop.dummy.DummyBean;

@SpringBootApplication
public class AspectWarrior2Application {

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(AspectWarrior2Application.class, args);
		DummyBean dummy = beanBag.getBean(DummyBean.class);
		dummy.hello();
	}

}
