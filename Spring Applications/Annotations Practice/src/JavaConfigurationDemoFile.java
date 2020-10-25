import annotationDemo.FortuneService;
import annotationDemo.SadFortuneService;
import annotationDemo.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
//@ComponentScan("annotationDemo")
public class JavaConfigurationDemoFile {
    
    @Bean
    public FortuneService getFortune() {
        return new SadFortuneService();
    }
    @Bean
    public SwimCoach getSwimCoach() {
        return new SwimCoach(getFortune());
    }
}
