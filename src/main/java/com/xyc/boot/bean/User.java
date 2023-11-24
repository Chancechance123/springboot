package com.xyc.boot.bean;

import lombok.Getter;

/**
 * @author XuYuCheng
 * @version 1.0
 * @ date 2023/11/22 20:04
 */
@Getter
public class User {
	private Long id;
	private String name;

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
