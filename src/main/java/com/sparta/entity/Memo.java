package com.sparta.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// jpa 에서 엔티티를 객체화?할 때 무조건 기본 생성자가 있어야함 -> 오버라이딩된 생성자 있을경우 .. 기본생성자 필요함

@Entity // JPA가 관리할 수 있는 Entity 클래스 지정
@Table(name = "memo") // 매핑할 테이블의 이름을 지정
public class Memo {
    @Id  //기본키* -> 엔티티 구분 (식별자) 할 수 있게 함!
    private Long id;

    // nullable: null 허용 여부 (기본값 true)
    // unique: 중복 허용 여부 (기본값 false -> false 일때 중복 허용)
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // length: 컬럼 길이 지정
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;
}