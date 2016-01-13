package com.demo.server;

import javax.xml.ws.Endpoint;

/**
 * 提供Web方式的访问Api
 * @author Luzhuo
 */
public class PublishServer {
	public static void main(String[] args) {
		//java jdk1.6.0_21以上 提供一个自带的类可以将java 应用程序发布成webservice
		// 参数:提供服务对外的访问地址; 提供服务的类的对象
		Endpoint.publish("http://192.168.0.107:8080/helloService", new HelloService());
		// http://192.168.0.107:8080/helloService?wsdl 获取文档
	}
}
