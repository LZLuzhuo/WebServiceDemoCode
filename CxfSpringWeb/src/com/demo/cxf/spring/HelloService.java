package com.demo.cxf.spring;

import javax.jws.WebService;

/**
 * ① 发布一个不带接口的webservice
 * @author Luzhuo
 */
@WebService
public class HelloService {
	public String getName(){
		return "汤唯";
	}
}
