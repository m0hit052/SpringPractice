package src.practicePack;

public class BaseBallCoach implements Coach{

    private FortuneService fortune;

    BaseBallCoach(FortuneService theFortune) {
        fortune = theFortune;
    }
    public BaseBallCoach() {
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins on practice";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

    public int getInt() {
        return 5;
    }
}
