package com.cos.blog.model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM -> JAVA(다른언어) Object --> 테이블로 매핑해주는 기술

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // 빌더 패턴!!
@Entity
//@DynamicInsert // insert시에 null인 필드를 제외시켜준다.
public class User {
	
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)// 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false,length = 30)
	private String username; // 아이디
	
	@Column(nullable = false,length = 100)
	private String password;
	
	@Column(nullable = false,length = 50)
	private String email;
	
	// @ColumnDefault("user")
	// DB는 RoleType이라는 게 없다.
	@Enumerated(EnumType.STRING)
	private RoleType role; // Enum을 쓰는게 좋다. // admin, user, manager -> 도메인(프로그래밍에서 도메인은 범위를 의미)
	
	
	@CreationTimestamp // 시간이 자동으로 입력
	private Timestamp createdTime;
	
}