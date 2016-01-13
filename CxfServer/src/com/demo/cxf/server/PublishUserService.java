package com.demo.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.demo.webservice.userService.UserService;
import com.demo.webservice.userService.UserServiceImpl;

/**
 * 方式二: 使用 cxf 提供的类 JaxWsServerFactoryBean 发布一个带接口的服务
 * @author Luzhuo
 */
public class PublishUserService {

	public static void main(String[] args) {
		// 创建发布服务的类
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://192.168.0.107:8080/userService"); // 设置对外的访问地址
		bean.setServiceClass(UserService.class); // 设置接口类型
		bean.setServiceBean(new UserServiceImpl()); // 设置接口的实现类
		
		// 添加消息拦截器
		bean.getInInterceptors().add(new LoggingInInterceptor()); // 拦截进来的消息
		bean.getOutInterceptors().add(new LoggingOutInterceptor()); // 拦截发出的消息
		
		bean.create();
	}
}
