package com.kdy.oct301f.download;

import java.io.File;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kdy.oct301f.KdyFileNameGenerator;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class DownloadDAO {
	
	@Value("${download.file.folder}")
	private String filefolder;
	
	// 파일명 넣어서 요청하면 폴더에 있는 그림파일 Resource

	// 파일명 넣어서 요청하면 폴더에 있는 파일 다운받을 수 있게 주기
	// 브라우저가 열중 알든 말든 무조건 다운 : header 값 설정
	// ResponseEntity<Resource> : 응답 내용 (Resource + header + ...)
	public ResponseEntity<Resource> getFile(String f) {
		try {
			UrlResource ur = new UrlResource("file:" + filefolder + "/" + f);
			
			// header 값에 attachment; filename="" 이 붙어 있어야함
			String h = "attachment; filename=\"" + URLEncoder.encode(f, "utf-8") + "\"";
			return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, h).body(ur);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public void download(Download d,MultipartFile mf, HttpServletRequest req) {
		try {
			String fileName = KdyFileNameGenerator.file(mf);
			mf.transferTo(new File(filefolder + "/" + fileName));
			d.setFileD2(fileName);
			req.setAttribute("d", d);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
