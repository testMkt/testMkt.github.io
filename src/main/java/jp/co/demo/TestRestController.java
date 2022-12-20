package jp.co.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@PostMapping("/posts/1")
	public ResponseEntity<?> post(@RequestBody TestDto requestDto ) {
	
		return new ResponseEntity<TestDto>(requestDto, HttpStatus.ACCEPTED);
	}

}
