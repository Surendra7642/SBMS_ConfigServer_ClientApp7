package com.surya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RefreshScope
public class GreetRestController {
	
	@Value("${msg}")
	@Autowired
	private String msg;

	@GetMapping("/")
	public String greetMsg() {
		return msg;
	}

}
