package figureData;

import java.util.Random;
import figures.*;

public class ColorsSelection {
    private String[] colors = {"Black", "White", "Red", "Yellow", "Blue"};
    public String getRandomColor() {
        int rnd = new Random().nextInt(colors.length);
        return colors[rnd];
    }
}
