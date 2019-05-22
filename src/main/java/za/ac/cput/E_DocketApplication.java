package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class E_DocketApplication {

    @Bean
    public RestTemplateBuilder restTemplate(){
        return new RestTemplateBuilder();
    }

    public static void main(String[] args) {
        SpringApplication.run(E_DocketApplication.class,args);
    }
}


