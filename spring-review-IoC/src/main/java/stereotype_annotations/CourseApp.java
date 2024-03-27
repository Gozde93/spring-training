package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.CourseConfig;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.MicroService;

public class CourseApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CourseConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        MicroService microService = container.getBean(MicroService.class);
        microService.getTotalHours();



    }
}
