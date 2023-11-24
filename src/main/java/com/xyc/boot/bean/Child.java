package com.xyc.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author XuYuCheng
 * @version 1.0
 * @ date 2023/11/23 21:12
 */
@Data
public class Child {
	private String name;
	private Integer age;
	private Date birthDay;
	private List<String> text; //数组
}
