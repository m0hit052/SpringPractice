package src.practicePack;

public class CricketCoach implements Coach{
    private FortuneService fortune;
    private String emailAddress;
    private String team;

    public CricketCoach() {

    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public void setFortuneService(FortuneService fortune) {
        this.fortune = fortune;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Do Catching and Bowling practice";
    }

    @Override
    public String getDailyFortune() {
        return "Believe in you, Give your best" + " " + fortune.getFortune();
    }


}
