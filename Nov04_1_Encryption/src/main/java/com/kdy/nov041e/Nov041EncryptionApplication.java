package com.kdy.nov041e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// 암호화
// SpringSecurity : 자체적 관리자 로그인 시스템 ▽ 없애기
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Nov041EncryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nov041EncryptionApplication.class, args);
	}

}
