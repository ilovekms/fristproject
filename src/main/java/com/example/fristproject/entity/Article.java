package com.example.fristproject.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor   // 디폴트 생성자 추가
@ToString
@Getter // 롬복으로 게터 추가
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 전략
    //@GeneratedValue
    private Long id;
    @Column
    private String title;
    @Column
    private String content;


}