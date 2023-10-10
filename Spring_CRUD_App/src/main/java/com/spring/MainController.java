package com.spring;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.Dao.ProductDao;
import com.spring.Model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao dao;
	
	@RequestMapping("/home")
	public String Home(Model m)
	{
		System.out.println("hii home");
		List<Product> list = dao.getAllProduct();
      
		m.addAttribute("product",list);
		
		
		return "datasend";
	}
	
	@RequestMapping("/add")
	public String AddProduct(@ModelAttribute Product product,Model m)
	{
		m.addAttribute("tital","Add Product");
		return "add";
	}
	
	@RequestMapping(path="/handlproduct" ,method=RequestMethod.POST)
	public RedirectView Handdata(@ModelAttribute Product product,HttpServletRequest request)
	{
		
		dao.Createproduct(product);
		RedirectView redirectView = new RedirectView();
		
		
		
		redirectView.setUrl(request.getContextPath()+"/home");
		
		return redirectView;
		
		
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView DeleteData(@PathVariable("id") int id,@ModelAttribute Product product,HttpServletRequest request)
	{
		
		dao.DeleteProduct(id);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/home");
		
		return redirectView;
		
	}
	
	@RequestMapping("/update/{id}")
	public String Update(@PathVariable("id") int id,Model m)
	{
		Product product = this.dao.getProduct(id);
		m.addAttribute("product",product);
		return "update";
	}

}
