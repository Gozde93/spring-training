package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewAppConfig {


    @Bean(name = "Message 1")
    public String str1(){
        return "Welcome to Cydeo";
    }

    @Bean
    public String str2(){
        return "Spring Core Practice";
    }
}
