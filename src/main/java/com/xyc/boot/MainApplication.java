package com.xyc.boot;

import com.xyc.boot.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author XuYuCheng
 * @version 1.0
 * @date 2023/11/21 20:48
 */
@SpringBootApplication
public class MainApplication {
	public static void main(String[] args) {
		var ioc = SpringApplication.run(MainApplication.class, args);
		// String[] names = ioc.getBeanDefinitionNames();
		// for (String name : names) {
		// 	System.out.println(name);
		// 	System.out.println(name);
		// }
		for (String cat : ioc.getBeanNamesForType(Cat.class)) {
			System.out.println("cat: " + cat);
		}
		for (String dog : ioc.getBeanNamesForType(Dog.class)) {
			System.out.println("dog: " + dog);
		}
		Pig pig = ioc.getBean(Pig.class);
		System.out.println("pig: " + pig);
		Sheep sheep = ioc.getBean(Sheep.class);
		System.out.println("sheep: " + sheep);

		Person person = ioc.getBean(Person.class);
		System.out.println("person: " + person) ;
	}
}
