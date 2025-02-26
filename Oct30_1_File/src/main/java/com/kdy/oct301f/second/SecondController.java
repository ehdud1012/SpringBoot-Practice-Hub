package com.kdy.oct301f.second;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SecondController {
	
	@Autowired
	private SecondDAO sDAO;
	
	@GetMapping("/pic.folder/{fileName}")
	public @ResponseBody Resource picFolder(@PathVariable("fileName") String f, HttpServletRequest req) {
		return sDAO.getImage(f);
	}
	
	@GetMapping("/second.go")
	public String secondGo(HttpServletRequest req) {
		req.setAttribute("contentPage", "second/uploadW");
		return "index";
	}
	@PostMapping("/second.upload")
	public String secondUpload(@RequestParam("pic") MultipartFile mf1,
						@RequestParam("pic3") MultipartFile mf2, 
						SecondPic sp,HttpServletRequest req) {
		sDAO.upload(mf1, mf2, sp, req);
		req.setAttribute("contentPage", "second/outputW");
		return "index";
	}
}
