package com.yongbum.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yongbum.board.entity.MemberEntity;

// 해당 인터페이스가 repository 임을 명시
@Repository
// repository는 인터페이스로 작성
// jpaRepository 인터페이스를 상속 받아야 함
// jpaRepository<table(EntityClass), primary key type>
public interface MemberRepository extends JpaRepository<MemberEntity, String> {
	
	// @Query : 커스텀 ORM 메서드 작성
	// 테이블명을 alias로 지정해서 사용
	// ?1, ?2 .... : 매개변수로 받아온 변수를 해당 위치로 넣기 위한 구문
	@Query("select m from member m where m.email = ?1")
	List<MemberEntity> myFindAll(String email);
}
