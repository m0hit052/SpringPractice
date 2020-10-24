package annotationDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")

    private FortuneService fortune;

////    @Autowired
//    TennisCoach(FortuneService fortune) {
//        this.fortune = fortune;
//    }




//    @Autowired
//    public void setFortuneService(FortuneService fortune) {
//        this.fortune = fortune;
//    }
    @Override
    public String getDailyWorkout() {
        return "Do Practice tennis alteast 5 hours a day ";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
