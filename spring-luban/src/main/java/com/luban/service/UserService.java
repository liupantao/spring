package com.luban.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author liupantao
 * @Date 2020/3/13
 * @Version V1.0
 **/
@Component
public class UserService {

	public  UserService(){
		System.out.println("....  user constructor service ...");
	}

	public void sayHello(){
		System.out.println(" hello user service ...");
	}
}
