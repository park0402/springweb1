package parkweb.dto;


import lombok.*;

@Getter @Setter
@ToString @NoArgsConstructor @AllArgsConstructor
@Builder
public class HelloDto {


    //필드
    private String name;
    private int amount;

}
