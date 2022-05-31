package com.sa.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sa.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	
	public static void main(String args[]) {
		//FileSystemResource res = new FileSystemResource("src/main/java/com/sa/config/ApplicationContext.xml");
		//ClassPathResource res = new ClassPathResource("com/sa/config/ApplicationContext.xml");
		ClassPathResource res = new ClassPathResource("ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		//Object obj = factory.getBean("wmg");
		Object obj = factory.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		String resultMsg = generator.generateWishMessage("Sourav");
		System.out.println("WishMessage is :: "+resultMsg);
	}

}
