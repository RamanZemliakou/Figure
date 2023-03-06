import figureData.FigureType;
import figures.BuildCircle;
import figures.BuildFigure;
import figures.BuildRectangle;
import figures.BuildTriangle;

import java.util.Random;

public class FiguresFactory {
    public BuildFigure getFigure(FigureType type){
        BuildFigure toReturn;
        switch (type) {
            case CIRCLE:
                toReturn = new BuildCircle();
                break;
            case TRIANGLE:
                toReturn = new BuildTriangle();
                break;
            case RECTANGLE:
                toReturn = new BuildRectangle();
                break;
            default:
                throw new IllegalArgumentException("Wrong figure type:" + type);
        }
        return toReturn;
    }
    public static void buildRandomFigure(FiguresFactory figuresFactory){
        BuildFigure randomFigure = getRandomFigure(figuresFactory);
        randomFigure.build();
        randomFigure.toString();
    }
    public static BuildFigure getRandomFigure(FiguresFactory figuresFactory){
        Random random = new Random();
        FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
        return (figuresFactory.getFigure(type));
    }
}
