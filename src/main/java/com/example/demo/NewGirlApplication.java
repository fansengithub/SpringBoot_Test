package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewGirlApplication {

	public static void main(String[] args) {
		System.out.println(" test!");
		// springBoot中的启动main()方法
		SpringApplication.run(NewGirlApplication.class, args);
	}
}
