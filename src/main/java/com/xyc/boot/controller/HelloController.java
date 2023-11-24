package com.xyc.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.awt.Color.red;

/**
 * @author XuYuCheng
 * @version 1.0
 * @ date 2023/11/21 20:47
 */
@RestController
public class HelloController {
	// redis
	@Autowired
	StringRedisTemplate redisTemplate;

	@GetMapping("/incr")
	public String incr() {
		Long haha = redisTemplate.opsForValue().increment("haha");
		return "增加后的值" + haha;
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
