package parkweb.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter@ToString
@NoArgsConstructor @AllArgsConstructor
@Builder
@Table( name = "room")  // 테이블 이름 정의
public class RoomEntity {

    @Id //PK
    @GeneratedValue( strategy = GenerationType.IDENTITY ) //Entity  개체
    private int rno;
    private String rtitle;
    private String lat; //위도
    private String lon; //경도 
    private String rtrans;//거래방식 [전세 , 월세 , 매매 ]
    private String rprice; //기격
    private String rarea; //면적
    private String rmanagementfee; //관리비
    private String rstructure; //구조
    private String rcompletiondate; //준공날짜
    private boolean rparking;//주차여부
    private boolean relevator; //엘리베이터 여부
    private String rindate; //입주가능일
    private int rfloor; //현재층
    private int maxfloor; //건물전체층
    private String rkind; // 건물 종류
    private String raddress; //주소
    @Column(columnDefinition="TEXT")
    private String rcontents; //상세설명
    private String rimg;





    private String rimg;

}
