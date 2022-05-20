package com.mx.tesoem.HolaMundo1_spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tesoem.beans.mundo;


public class App {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
	
		appContext = new ClassPathXmlApplicationContext("com/tesoem/xml/beans.xml");
		mundo m = appContext .getBean(mundo.class);
		System.out.print(m.getMensaje());
		}

}
