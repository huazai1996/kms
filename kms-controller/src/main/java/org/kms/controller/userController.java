package org.kms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class userController {
	
	@RequestMapping("/index")
	public String index() throws Exception{
		return "wocao";
	}
	
}
