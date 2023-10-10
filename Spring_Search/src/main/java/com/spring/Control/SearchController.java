package com.spring.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userid}")
	public String GetUserDetile(@PathVariable("userid") int userid)
	{
		System.out.println(userid);
		return "home";
	}
	
	@RequestMapping("/home")
	public String Home()
	{
		System.out.println("going to home view");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView Search(@RequestParam("box") String qu) {
		
	
		String url="http://www.google.com/search?q="+qu;
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(url);
		
		return redirectView;
		
	}

}
