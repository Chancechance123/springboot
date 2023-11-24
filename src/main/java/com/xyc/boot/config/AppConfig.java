package com.xyc.boot.config;

import com.xyc.boot.bean.Sheep;
import com.xyc.boot.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XuYuCheng
 * @version 1.0
 * @ date 2023/11/22 20:09
 */
@EnableConfigurationProperties(Sheep.class)
@Configuration
public class AppConfig {
	@Bean
	public User user(){
		var user = new User();
		user.setId(1L);
		user.setName("zhansan");
		return user;
	}
}
