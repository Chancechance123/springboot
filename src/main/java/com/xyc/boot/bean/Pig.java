package com.xyc.boot.bean;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author XuYuCheng
 * @version 1.0
 * @ date 2023/11/22 20:05
 */
@ConfigurationProperties(prefix = "pig")
@Getter
@Component
public class Pig {
	private Long id;
	private String name;

	private Integer age;

	@Override
	public String toString() {
		return "Pig{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
