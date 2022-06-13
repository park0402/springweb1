package parkweb.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //JPA : DB내 테이블과 메이플 (연결
@Getter //롬복
@NoArgsConstructor //롬복
public class HelloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //varchar   length = 필드 길이
    @Column(length =500,nullable = false) //jpa : Cloumn (속성명 = 값 , 속성명 = 값)
    private  String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private  String content;
    private String author;

    @Builder
    public HelloEntity(String title, String content , String author){
        this.title = title;
        this.content = content;
        this.author = author ;
    }

 }
