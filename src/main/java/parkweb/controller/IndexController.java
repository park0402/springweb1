package parkweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import parkweb.dto.HelloDto;

//@Controller 사용 불가한 코드 why ? :
//일반 컨트롤러는 절대 일반 문자열을 반환 할 수 없다 그래서
//템플릿을 반환해야함
//public class IndexController {
//    @GetMapping("/")  // "/" 최상위 경로
//        public HelloDto index(){
//
//        HelloDto helloDto = HelloDto.builder()
//                .name("유재석")
//                .amount(10000)
//                .build();
//
//        return helloDto;
//    }
//}

@Controller
public class IndexController {
    @GetMapping("/")  // "/" 최상위 경로
        public String index(Model model){ //Model 스프링에서 제공해주는 ui
        //Dto 생성
        HelloDto helloDto = HelloDto.builder()
                .name("유재석")
                .amount(10000)
                .build();
        //해당 템블릿에 데이터보내기
        model.addAttribute("data",helloDto);
        return "main";
    }
}
