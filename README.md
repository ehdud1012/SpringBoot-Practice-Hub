# Spring Boot 연습 저장소

이 저장소는 **Spring Boot** 기반의 웹 개발을 연습하기 위한 프로젝트입니다.

## 📌 개발 환경

- **언어:** Java
- **프레임워크:** Spring Boot
- **빌드 도구:** Gradle (Groovy)
- **서버:** 내장 Tomcat (jar 실행)
- **템플릿 엔진:** Thymeleaf
- **데이터베이스:** JPA
- **Java 버전:** 17 (Spring Tools 4 사용)

## 📂 실습 내용

### 📅 10월 실습

#### 🛠️ Spring Boot 및 신기술 적용
- **Oct25_1_Test** → Spring Boot 테스트
- **Oct28_1_Thymeleaf** → Thymeleaf 기본
- **Oct29_1_Lombok-1** → Lombok 적용
- **Oct30_1_File** → 파일 업로드
- **Oct31_1_JPA** → JPA 실습

### 📅 11월 실습

#### 🔐 보안 및 암호화
- **Nov01_1_JPA** → JPA 활용
- **Nov04_1_Encryption** → 데이터 암호화
- **Nov04_MiniProject** → Spring Boot 미니 프로젝트

#### 🌐 jQuery & AJAX
- **Nov18_1_jQuery/public** → jQuery 기본
- **Nov19_1_jQuery/public** → jQuery 활용
- **Nov20_1_jQuery/public** → jQuery 이벤트
- **Nov21_1_jQuery/public** → jQuery DOM 조작
- **Nov21_2_HTML5/public** → HTML5 실습
- **Nov25_1_jQuery/public** → jQuery 추가 실습
- **Nov25_2_jQueryAJAX** → jQuery AJAX
- **Nov26_1_CrossDomainAJAX/public** → CORS AJAX 요청
- **Nov27_1_CrossDomainAJAX/public** → Cross-Domain AJAX 실습
- **Nov28_1_CrossDomainAJAX** → Cross-Domain AJAX 응용
- **Nov29_1_jQueryMobile/public** → jQuery Mobile

### 📅 12월 실습
- **Dec04_2_RealtimeBBS** → 실시간 게시판 프로젝트

### 🚀 Spring Boot 개념 정리

#### ✅ 유지보수 vs 보안
- 기존 **Spring**을 유지하면서 유지보수가 쉬운 개발 방식으로 전환
- Spring Boot를 통해 **신기술 적극 도입**

#### 🔥 JavaScript의 한계
- Vanilla JavaScript 사용 시 **DOM 조작 불편**
- **jQuery**가 등장하며 JavaScript의 불편함을 해결

#### ⚙️ Spring Boot 특징
- **Spring Starter Project**를 활용한 빠른 개발 환경 구축
- **Gradle (Groovy)** 기반으로 빌드 및 의존성 관리
- **내장 Tomcat 사용**으로 간편한 배포 (jar 실행 가능)
- **Thymeleaf 템플릿 엔진** 사용 (EL + JSTL보다 난이도 있음)
- **JPA를 통한 ORM 지원**
- **UTF-8 지원** (GET/POST 둘 다 문제없이 처리 가능)

### 🔄 비동기식 통신과 AJAX

#### 🛠️ AJAX 비동기 통신
- **AJAX**를 사용하면 **서버의 응답을 기다리지 않고** 요청을 보낼 수 있음
- **비동기 방식**으로 동작하므로 응답이 없더라도 프로그램 실행이 계속됨

#### 🚧 동일 출처 정책 (Same-Origin Policy)
- 브라우저에서는 **외부 API 요청 제한**
- 다른 도메인에서 데이터를 가져오려 하면 차단됨 (예: 기상청 API 요청 불가)

#### ✅ Cross-Domain AJAX 해결 방법
- **Cross-Domain AJAX**: 서버 측에서 프록시 설정 후 외부 API 요청 가능
- **Reverse AJAX (Polling 방식)**: 주기적으로 서버에 요청을 보내 최신 데이터 가져오기

## 📄 라이선스

이 프로젝트는 자유롭게 활용할 수 있습니다. 😊
