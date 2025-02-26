package com.kdy.oct301f.download;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DownloadController {
	
	@Autowired
	private DownloadDAO dDAO;
	
	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadGo(@PathVariable("fileName") String f, HttpServletRequest req) {
		return dDAO.getFile(f);
	}
	
	@GetMapping("/download.go")
	public String downloadGo(HttpServletRequest req) {
		req.setAttribute("contentPage", "download/inputD");
		return "index";
	}
	@PostMapping("/download.upload")
	public String downloadUpload(@RequestParam("fileD") MultipartFile mf, Download d, HttpServletRequest req) {
		dDAO.download(d, mf, req);
		req.setAttribute("contentPage", "download/outputD");
		return "index";
	}
}
