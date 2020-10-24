package annotationDemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Good day ",
            "Bad Day ",
            "Tough day : Keep Working "
    };

    @Override
    public String getFortune() {
        Random getRandom = new Random();
        int index = getRandom.nextInt(data.length);
        return data[index];
    }
}
