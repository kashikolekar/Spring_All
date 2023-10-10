package com.spring.Cont;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadControoler {

	@RequestMapping("/fileform")
	public String FileUp()
	{
		return "fileform";
	}

	@RequestMapping(path="/uploadimg",method = RequestMethod.POST)
	public String Uploadfile(@RequestParam("img") CommonsMultipartFile file ,HttpSession httpSession,Model m)
	{
		System.out.println("file uploadhandler");

		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		            byte[] data = file.getBytes();

		 String path = httpSession.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"img"+File.separator+file.getOriginalFilename();

		 System.out.println(path);

		 FileOutputStream fos;
		try {
			fos = new FileOutputStream(path);
			fos.write(data);
			 fos.close();
			 System.out.println("file uploaded");

			 m.addAttribute("msg","uploaded successfully");
			 m.addAttribute("filename" ,file.getOriginalFilename());


		} catch (IOException e) {
			System.out.println("file uploaded error");
			 m.addAttribute("msg","uploaded error");
			e.printStackTrace();
		}


		return "filesuccess";
	}

}
