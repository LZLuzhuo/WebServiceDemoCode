package com.demo.cxf.client;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

import com.webservice.wsdl.CxfWebServicePortType;

/**
 * 方式一: 用 cxf 框架提供 ClientProxyFactoryBean 的类调用一个服务,
 * 依赖一个接口,这个接口通过 wsimport 生成.
 * @author Luzhuo
 */
public class CxfClientInvoke {
	public static void main(String[] args) {
		// 创建调用WebService服务的类
		ClientProxyFactoryBean bean = new ClientProxyFactoryBean();
		bean.setAddress("http://192.168.0.107:8080/server"); // 设置访问地址
		bean.setServiceClass(CxfWebServicePortType.class); // 设置服务的接口
		CxfWebServicePortType cxfWebServicePortType = (CxfWebServicePortType) bean.create(); //创建接口类型
		
		cxfWebServicePortType.sayHello();
	}
}
