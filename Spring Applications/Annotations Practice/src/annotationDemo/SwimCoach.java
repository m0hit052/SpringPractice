package annotationDemo;

public class SwimCoach implements Coach{

    private FortuneService fortune;

    public SwimCoach(FortuneService fortune) {
        this.fortune = fortune;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 300m daily";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
