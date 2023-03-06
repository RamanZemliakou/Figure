package figureData;

import java.util.Random;

public class SizeData {
    private static double minRange = 1;
    private static double maxRange = 10;
    public static double randomRadius(){
        Random rand = new Random();
        double randSize = minRange + (maxRange - minRange) * rand.nextDouble();
        return Math.round(randSize * 100.0) / 100.0;
    }
    public static double randomBase(){
        Random rand = new Random();
        double randSize = minRange + (maxRange - minRange) * rand.nextDouble();
        return Math.round(randSize * 100.0) / 100.0;
    }
    public static double randomHeight(){
        Random rand = new Random();
        double randSize = minRange + (maxRange - minRange) * rand.nextDouble();
        return Math.round(randSize * 100.0) / 100.0;
    }

    public static double randomLength(){
        Random rand = new Random();
        double randSize = minRange + (maxRange - minRange) * rand.nextDouble();
        return Math.round(randSize * 100.0) / 100.0;
    }
    public static double randomWidth(){
        Random rand = new Random();
        double randSize = minRange + (maxRange - minRange) * rand.nextDouble();
        return Math.round(randSize * 100.0) / 100.0;
    }

}

