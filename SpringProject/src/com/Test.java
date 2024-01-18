package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		//	Resource rs=new ClassPathResource("Bean.xml");
		//	BeanFactory bf=new XmlBeanFactory(rs);
		ApplicationContext ap=new ClassPathXmlApplicationContext("Bean.xml");
		Connection c=(Connection)ap.getBean("a");
		c.commit();
		c.rollback();
	}
}
