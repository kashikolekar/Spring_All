package com.spring.Cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Model.User;

@Controller
public class MVCInterceptor {

	@RequestMapping("/send")
	public String Send()
	{

		return "Senddata";
	}

	@RequestMapping("/acc")
	public String Accept(@ModelAttribute User user)
	{
		return "Accept";
	}

}
