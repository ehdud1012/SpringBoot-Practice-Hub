package com.kdy.oct301f.second;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kdy.oct301f.KdyFileNameGenerator;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class SecondDAO {
	
	@Value("${pic.file.folder}")
	private String picFolder;
	
	public Resource getImage(String f) {
		try {
			return new UrlResource("file:" + picFolder + "/" + f);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public void upload(MultipartFile mf1, MultipartFile mf2, SecondPic sp, HttpServletRequest req) {
		try {
			String picFile1 = KdyFileNameGenerator.file(mf1);
			String picFile2 = KdyFileNameGenerator.file(mf2);
			mf1.transferTo(new File(picFolder + "/" + picFile1));
			mf2.transferTo(new File(picFolder + "/" + picFile2));
			
			System.out.println(picFile1);
			sp.setPic2(picFile1);
			sp.setPic4(picFile2);
			req.setAttribute("sp", sp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
