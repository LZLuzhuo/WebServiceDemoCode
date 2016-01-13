package com.demo.cxf.spring.user;

import javax.jws.WebService;

/**
 * ② 通过此配置发布一个带接口的webservice
 * @author Luzhuo
 */
@WebService
public interface UserService {
	public String getAgeById(int id);
}
