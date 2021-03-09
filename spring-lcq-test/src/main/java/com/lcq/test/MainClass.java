package com.lcq.test;

import com.lcq.test.config.InstanceA;
import com.lcq.test.config.SunnyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainClass
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/12/24 10:55
 * @Version: 1.0
 **/

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SunnyConfig.class);
		System.out.println(applicationContext.getBean(InstanceA.class));
	}
}
