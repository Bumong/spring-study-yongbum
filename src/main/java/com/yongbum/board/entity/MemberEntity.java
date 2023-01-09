package com.yongbum.board.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
	Member
	아이디
	비밀번호
	닉네임
	전화번호
	주소
	프로필사진
*/	

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
// 해당 클래스가 Entity 클래스임을 명시
// 인자로 ETITY의 이름을 지정 할 수 있음
@Entity(name="MEMBER")
// 해당 Entity 클래스와 데이터베이스 table을
// 인자로 지정한 이름으로 매핑 
@Table(name="MEMBER")
public class MemberEntity {
	
	// 해당 필드가 primary key 임을 명시
	@Id
	// 해당 primary key의 value 자동 생성을 지시
	//@GeneratedValue
	private String email;
	private String password;
	private String nickname;
	private String profile;
	private String telNumber;
	private String address;
}
