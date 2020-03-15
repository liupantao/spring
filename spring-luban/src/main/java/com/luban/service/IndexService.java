package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName IndexService
 * @Description: TODO
 * @Author liupantao
 * @Date 2020/3/13
 * @Version V1.0
 **/
@Component
public class IndexService {

	@Autowired
	private UserService userService;

	public  IndexService(){
		System.out.println(" index  constructor service .....");
	}

	public void sayIndex(){
		userService.sayHello();
	}
}
