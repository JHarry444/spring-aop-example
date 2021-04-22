package com.qa.aop.dummy;

import org.springframework.stereotype.Component;

@Component
public class DummyBean {

	public void hello() {
		System.out.println("Hello, World!");
	}

}
