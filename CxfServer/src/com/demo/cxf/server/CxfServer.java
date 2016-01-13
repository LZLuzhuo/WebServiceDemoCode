package com.demo.cxf.server;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * 方式一: 用 cxf 框架提供的类 ServerFactoryBean 发布一个服务
 * @author Luzhuo
 */
public class CxfServer {
	public static void main(String[] args) {
		// 创建发布服务的类
		ServerFactoryBean bean = new ServerFactoryBean();
		bean.setAddress("http://192.168.0.107:8080/server"); // 服务对外的访问地址
		bean.setServiceClass(CxfWebService.class); // 修改服务类的接口类型, 默认当前类
		bean.setServiceBean(new CxfWebService()); // 设置服务类的实现
		bean.create(); // 发布服务
	}
}
