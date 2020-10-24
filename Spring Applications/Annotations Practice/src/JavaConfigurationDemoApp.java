import annotationDemo.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigurationDemoFile.class);

        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
