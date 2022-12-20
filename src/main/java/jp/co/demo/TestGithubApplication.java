package jp.co.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestGithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestGithubApplication.class, args);
	}

	@RequestMapping("/3")
	pulic String test() {
		return "index";
	}
}
