package com.kdy.oct301f.img;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kdy.oct301f.KdyFileNameGenerator;

import jakarta.servlet.http.HttpServletRequest;

// 파일 가져오기
// 		Servlet/JSP : 파일 인코딩 불가 -> 외부 lib cos.jar 갖다 씀
//		SpringLegacy : 내장된거 있는데 전통적이어서 -> 그래도 cos.jar 사용
//			1) 서버에 업로드될 폴더 생성 -> 서버가 어딨는데
//					=> 프로젝트에 폴더 만들어놔서 서버에 생기도록
//			2) 그 폴더의 절대 경로
//					서버가 어딨는데 경로를 아니
//						-> 상대경로 넣으면 절대경로 리턴해주는 메소드 활용
//			3) 허용 파일 최대 크기 : 소스로 작성		
//			4) 파일명 중복 : new DefaultFileRenamePolicy()
//
//		SpringBoot : 전통? 그게 뭔데 => 내장된거 쓸거임
//			1) 보안, 유지 보수 등으로 재배포를 하면 WAR파일 압축이 풀리면서 폴더가 다시 생김 
//				→ 업로드 해놓은 파일 다 사라짐
//				=> 그냥 서버에 폴더 만들어 / 보안 문제 해결되게 톰캣과 상관없는 외부에 만들기
//			2) 톰캣과 상관없는 외부에 있어서 : 상대 경로 안됨
//				=> 내가 만들었기 떄문에 경로는 당연히 알 것
//					그 경로를 계속 쓸테니까
//					- application.properties 파일에 등록
//						img.file.folder="C:/KDY/oct301_img"
//					- M에 등록 후 사용
//						@Value("${img.file.folder}")
//						private String imgFolder;
//			3) application.properties 파일에 등록 (파일 사이즈, 제목 포함한 파일 사이즈)
//					spring.servlet.multipart.max-file-size=10MB
//					spring.servlet.multipart.max-request-size=20MB
//			4) 중복처리는 직접
//				1. 폴더 내에 파일 이름을 체크 후 ..
// 				2. 아예 모든 파일에 중복 안되게끔 뭐 붙여서 (token처럼)
//					- 날짜
//					- UUID (네트워크상에서 뭐 구별할 때 쓰는 16진수)

@Service
public class imgDAO {
	
	@Value("${img.file.folder}")
	private String imgFolder;
	
	public Resource getImage(String f) {
		try {
			return new UrlResource("file:" + imgFolder + "/" + f);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
	public void upload(MultipartFile mf, Img i, HttpServletRequest req) {
		try {
			String imgFile = KdyFileNameGenerator.file(mf);
			mf.transferTo(new File(imgFolder + "/" + imgFile)); // 업로드
			i.setImgFile2(imgFile);
			req.setAttribute("i", i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
