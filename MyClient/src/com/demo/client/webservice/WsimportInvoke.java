package com.demo.client.webservice;

import com.webservice.wsdl.HelloService;
import com.webservice.wsdl.HelloServiceService;
import com.webservice.wsdl.User;

/**
 * 方式一:通过wsimport调用一个自定义类型的服务
 * @author Luzhuo
 */
public class WsimportInvoke {
	public static void main(String[] args) {
		//1. 找到接口(HelloService) 与 获取接口(HelloServiceService) 的实现类
		HelloService helloService = new HelloServiceService().getHelloServicePort();
		User user = helloService.getUserByName(1);
		System.out.println(user.getUserName()+";"+user.getUserAge());
	}
}
