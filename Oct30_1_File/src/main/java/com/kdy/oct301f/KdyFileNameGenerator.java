package com.kdy.oct301f;

import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class KdyFileNameGenerator {
	public static String file(MultipartFile mf) {
		String imgFile = mf.getOriginalFilename(); // 파일명
		String type = imgFile.substring(imgFile.lastIndexOf("."));
		imgFile = imgFile.replace(type, "");
		String uuid = UUID.randomUUID().toString();
		return imgFile + "_" + uuid + type;
	}
}
