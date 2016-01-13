package com.demo.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.demo.bean.User;

/**
 * 提供服务的类
 * @author Luzhuo
 */
@WebService // 1.被发布的类上面必须加上该注解,并在类里写上方法
(
		targetNamespace="http://server.demo.com/",	 // 修改命名空间
		serviceName="HelloServiceService", // 修改服务名称
		portName="HelloServicePort"  // 修改接口名称
)
public class HelloService {
		@WebMethod(exclude=true) //不对外公开
		// 2.方法必须为public ,非static ,非 final的方法
		public void doubleKill(){
			System.out.println("WebServiceDemo");
		}
		
		@WebMethod(operationName="getUserByName") //修改方法名称
		public @WebResult(name="UserObject")User getUserById(@WebParam(name="userId")int id){  //设置返回名,默认user; 设置参数名,默认arg0
			User user=new User();
			user.setId(id);
			user.setUserName("汤唯");
			user.setUserAge(21);
			return user;
		}
}
