package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        //hey spring, please create container based on my config class
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, NewAppConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();

        String str1 = container.getBean("Message 1",String.class);
        String str2 = container.getBean("str2",String.class);
        System.out.println(str1);
        System.out.println(str2);






    }
}
