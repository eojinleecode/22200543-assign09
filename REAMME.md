# 22200543 이어진 웹서비스 개발 01분반 9주차 과제

## 1. 프로젝트 소개
* 주제 및 주요 기능 : 영화 데이터를 다루는 CRUD program, DBeaver가 아닌 JPA를 이용해서 DB CRUD 구현  
* Entity 필드 구조 : 
* 프로젝트 구조 및 개발 환경 :
* Github Repository URL : https://github.com/eojinleecode/22200543-assign09
* Render Deployment URL : https://two2200543-assign09.onrender.com/api/movies

## 2. Database SQL Practice
* spl 연습 결과 (movie_sql)

![](image/tablecreate(movie).png)
![](image/insert_newvalues(moive).png)
![](image/update(movie).png)
![](image/delete(moive).png)
![](image/select(moive).png)


## 3. Spring Data JPA 구현
* Entity 및 JpaRepository 설명 :
* 사용한 Annotation의 역할 :
* REST API Endpoint 목록 및 요청응답 JSON :
* JPA Entity와 MariaDB Table 비교 :

## 4. JPA , SQL 비교

* save(), findAll(), findById(), deleteById() 사용 결과
* 실제 Hibernate SQL 확인
* SQL을 직접 작성하는 방식과 JPA 방식의 차이


## 5. 배포 및 환경 설정

* IntelliJ 및 Render 환경변수 설정 방법(변수명만 기록) : DB_URL ,DB_USERNAME ,DB_PASSWORD
  에다 제공 받은 개인 DB 정보를 대입시키면 된다, 개인정보를 위해 (가리기 위해) 존재한다고 생각하고 있습니다.

* Render 배포 과정 : Docker file 작성 -> Render site 접속 -> github 개인 레포지터리 연결 -> 로딩 대기 -> 배포 사이트/api/movies(제가 만든 DB name)로 들어가서 결과 확인 -> json 형식의 key,value 값들이 나열되어 있으면 정상
* 배포 URL의 CRUD 테스트 결과 :

* MariaDB 데이터 저장 확인 : MariaDB에서 하단에 있는 Refresh(새로고침)을 누르면 데이터의 저장,수정,조회,삭제 등 결과를 알 수 있다.
* 발생한 문제와 해결 방법  : Docker file을 생성하지 않고 배포를 했더니 무한로딩에 걸렸습니다, 따라서 IntelliJ에서 docker init 을 통해 
  기본적인 Docker file(뼈대)을 만들고 그 안에 세부사항을 수정하였습니다.  

## 6. Weekly Report

* Key Learning: 새롭게 이해한 내용 3가지
* Problem & Solution: 문제 1개 이상과 해결 과정 
* Code Review: 중요한 코드 1개와 동작 설명
* AI Usage: AI 활용 내용 및 직접 수정·검증한 부분, 자신이 생각하는 AI사용률(%)
* Reflection: 추가로 공부하고 싶은 내용