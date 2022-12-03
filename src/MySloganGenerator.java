import java.util.Random;

public class MySloganGenerator implements SloganGenerator{

    String[] slogans = {"We got this", "Everyone going prison", "We can get away with murder"};

    @Override
    public String getSlogan() {
        Random rand = new Random();
        int randNum = rand.nextInt(slogans.length);
        return slogans[randNum];
    }
}
