package parkweb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 스프링부트의 자동설정,  스프링빈(클래스메모리) 일기와 생성을 모두 관여

public class Application {
    public static void main(String[] args) { //메인스레드 (코드를읽어주는 역할)
        SpringApplication.run( Application.class);

        // 잘되다가 안될때 import가 안된다는거임 스프링 not find symbol 뜰때 file invalidate caches 해주기
        // 스프링 bulid 에서 rebulid project 해주기

    }
}
