package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author liupantao
 * @Date 2020/3/13
 * @Version V1.0
 **/
public class Test {

	public static void main(String[] args) {

		//初始化spring容器
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		IndexService bean = ac.getBean(IndexService.class);
		bean.sayIndex();
	}
}
