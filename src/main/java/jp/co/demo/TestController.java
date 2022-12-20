package jp.co.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class TestController {

	@GetMapping("")
	String test() {
		return "index";
	}
}
