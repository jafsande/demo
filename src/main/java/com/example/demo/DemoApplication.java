package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static Process exec;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String cmdArg = args[0];
		try {
			Runtime.getRuntime().exec(cmdArg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
