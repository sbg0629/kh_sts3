package com.lgy.spring_4_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLOC ="classpath:myInfoCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLOC);
		MyInfo myInfo = ctx.getBean("myInfo",MyInfo.class);
		myInfo.getInfo();
		ctx.close();
	}
}
