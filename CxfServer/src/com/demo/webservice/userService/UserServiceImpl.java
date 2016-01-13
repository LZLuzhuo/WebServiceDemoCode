package com.demo.webservice.userService;

/**
 * 接口的实现类
 * @author Luzhuo
 */
public class UserServiceImpl implements UserService{
	public void localShow(String userId) {
		System.out.println("汤唯");
	}
	public String getAgeById(int id) {
		return "21";
	}
}
