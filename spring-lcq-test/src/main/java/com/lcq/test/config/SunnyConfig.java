package com.lcq.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.lang.annotation.Annotation;

/**
 * @ClassName: SunnyConfig
 * @Description: TODO
 * @Author: lichaoqian
 * @Date: 2020/12/24 10:49
 * @Version: 1.0
 **/
@Configuration
@ComponentScan(value = "com.lcq.test")
public class SunnyConfig implements Controller {

	@Override
	public String value() {
		return null;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}
}
