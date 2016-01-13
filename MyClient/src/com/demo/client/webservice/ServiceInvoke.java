package com.demo.client.webservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.wsdl.HelloService;
import com.webservice.wsdl.User;

/**
 * 方式三: 通过客户端编程的方式调用WebService,通过java jdk 的Service类,依赖一个接口,通过wsimport生成的本地代码中获取
 * @author Luzhuo
 */
public class ServiceInvoke {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://192.168.0.107:8080/helloService?wsdl"); // 文档地址
		String targetNamespace = "http://server.demo.com/"; //命名空间
		
		// 参数: 命名空间: definitions - targetNamespace; 服务名称: service - name.
		QName serviceName = new QName(targetNamespace,"HelloServiceService"); 
		// 创建服务
		Service service = Service.create(url,serviceName);
		// 获取接口类型 参数:命名空间; 接口名:port - name.
		HelloService helloService = service.getPort(new QName(targetNamespace,"HelloServicePort"),HelloService.class);
		User user = helloService.getUserByName(1);
		System.out.println(user.getUserName()+";"+user.getUserAge());
	}
}
