package src;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//import src.practicePack.BaseBallCoach;
import src.practicePack.BaseBallCoach;
import src.practicePack.Coach;
import src.practicePack.CricketCoach;
import src.practicePack.FortuneService;

public class SpringApp {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("src/applicationContext.xml");

        Coach theCoach = context.getBean("myCoach",Coach.class);  // baseball coach

        Coach newCoach = context.getBean("newCoach",Coach.class);  // tracking coach

        CricketCoach tempCoach = context.getBean("Cricket", CricketCoach.class);  // cricket coach

//        BaseBallCoach tempCoach = new BaseBallCoach();
//
//        System.out.println(tempCoach.getInt());   :- working because tempcCoach is basketball coach, It can implement its own methods.

//        System.out.println(newCoach.getInt());    :-  not working because newCoach is coach not the basketball coach, It will implement methods of coach object

//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(newCoach.getDailyFortune());
//        System.out.println(theCoach.getDailyFortune());
        System.out.println(tempCoach.getDailyFortune());
        System.out.println(tempCoach.getDailyWorkout());
        System.out.println("E-mail :- " + tempCoach.getEmailAddress() + " " + "team :-" + tempCoach.getTeam());

        context.close();
    }

}
