package com.kdy.oct301f.img;

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
public class ImgController {
	
	@Autowired
	private imgDAO iDAO;
	
	// 정식으로 이미지 폴더 요청주소 만들기
	@GetMapping("/img.folder/{fileName}")
	public @ResponseBody Resource imgFolder(@PathVariable("fileName") String f, HttpServletRequest req) {
		return iDAO.getImage(f);
	}
	
	@GetMapping("/imgFile.go")
	public String imgGO(HttpServletRequest req) {
		req.setAttribute("contentPage", "img/upload");
		return "index";
	}
	
	@PostMapping("/imgFile.upload")
	public String uploadGo(@RequestParam("imgFile") MultipartFile mf, Img i, HttpServletRequest req) {
		iDAO.upload(mf, i, req);
		req.setAttribute("contentPage", "img/imgoutput");
		return "index";
	}
}
