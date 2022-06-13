package parkweb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import parkweb.dto.HelloDto;

@RestController //화면을 백에서 가져올때 [타임리프 x ] json을 반환
    public class HelloController {
    @GetMapping("/hello")
    public HelloDto hello() {
       HelloDto helloDto = HelloDto.builder()
               .name("유재석")
               .amount(10000)
               .build();

        return helloDto; //dto 반환
    }
}
