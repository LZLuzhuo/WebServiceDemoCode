package com.demo.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webservice.wsdl.UserService;

/**
 * 通过配置文件的方式调用WebService, 需要依赖一个接口
 * @author Luzhuo
 */
public class SpringClientInvoke {
	public static void main(String[] args) {
		// 解析spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("CxfSpring.xml");
		UserService callService = (UserService) context.getBean("demo"); // 获得接口实例对象
		
		System.out.println(callService.getAgeById(1));
	}
}
