package com.spring.Cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectControl {


	/*
	 * @RequestMapping("/one") public String one() {
	 * System.out.println("This is one Handler");
	 *  return "redirect:/enjoy";
	 *
	 * }
	 *
	 *
	 * @RequestMapping("/enjoy") public String two()
	 * {System.out.println("This is second handler");
	 * return "Contact";
	 *  }
	 */



	  @RequestMapping("/one") public RedirectView one() {
	  System.out.println("This is one Handler"); RedirectView redirectView = new
	  RedirectView(); redirectView.setUrl("https://leetcode.com/tag/hash-table/");
	  return redirectView;

	  }


	  @RequestMapping("/enjoy") public String two()
	  {System.out.println("This is second handler"); return "Contact"; }


	/*
	 * @RequestMapping("/one") public String one(HttpServletResponse resp) {
	 * System.out.println("This is one Handler");
	 *
	 * try { resp.sendRedirect(""); } catch (IOException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } return "";
	 *
	 * }
	 *
	 *
	 * @RequestMapping("/enjoy") public String two()
	 * {System.out.println("This is second handler"); return "Contact"; }
	 */


}
