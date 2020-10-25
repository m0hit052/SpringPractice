package annotationDemo;

public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "TOday is a sad day";
    }
}
