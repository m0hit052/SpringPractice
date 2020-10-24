package src.practicePack;

public class TrackCoach implements Coach{

    private FortuneService fortune;
    TrackCoach(FortuneService fortune) {
        this.fortune = fortune;
    }
    @Override
    public String getDailyWorkout() {
        return "Run 5 km daily";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it :" + fortune.getFortune();
    }
}
