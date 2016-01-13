package com.demo.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.webservice.wsdl.UserService;

/**
 * 方式二: 用 cxf 提供的类 JaxWsProxyFactoryBean 来调用一个服务
 * @author Luzhuo
 */
public class CxfJaxWsInvoke {
	public static void main(String[] args) {
		// 创建调用服务的类
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setAddress("http://192.168.0.107:8888/userService"); // 设置访问地址
		bean.setServiceClass(UserService.class); // 设置接口类型
		UserService userService = (UserService) bean.create();
		
		System.out.println(userService.getAgeById(1));
	}
}
