package com.ready4stage.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ready4stage.backend.Database.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		new initDatabase().initializeDB();
		SpringApplication.run(DemoApplication.class, args);
	}

}
