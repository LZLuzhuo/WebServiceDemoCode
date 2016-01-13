package com.demo.webservice.userService;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 方式二,定义一个接口
 * @author Luzhuo
 */
@WebService
//@BindingType(value=SOAPBinding.SOAP12HTTP_BINDING) // 发布一个soap1.2版本的协议
public interface UserService {
	public void localShow(String userId);
	public String getAgeById(int id);
}
