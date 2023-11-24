package com.xyc.boot.config;

import com.alibaba.druid.FastsqlException;
import com.xyc.boot.bean.Cat;
import com.xyc.boot.bean.Dog;
import com.xyc.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XuYuCheng
 * @version 1.0
 * @ date 2023/11/22 20:09
 */
@Configuration
public class AppConfig2 {
	@ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
	@Bean
	public Cat cat() {
		return new Cat();
	}

	@ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
	@Bean
	public Dog dog() {
		return new Dog();
	}
}
