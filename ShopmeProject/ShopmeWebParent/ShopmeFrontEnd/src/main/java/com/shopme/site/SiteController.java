package com.shopme.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

	@GetMapping("")
	public String viewHomepage(){
		return "index";
	}

}
