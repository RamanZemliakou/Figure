package figures;

import figureData.ColorsSelection;
import figureData.SizeData;


public class BuildCircle implements BuildFigure {
    static SizeData sizeData = new SizeData();
    private static double radius = sizeData.randomRadius();
    @Override
    public String figureName() {
        return "Circle";
    }

    @Override
    public String figureColor(){
        ColorsSelection colorsSelection = new ColorsSelection();
        return colorsSelection.getRandomColor();
    }

    @Override
    public double figurePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double figureArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String build(){
        System.out.println("I'm building a Circle.....");
        return null;
    }
    public String toString(){
        System.out.println("Figure: " + figureName() + ", Color: " + figureColor() + ", Perimeter: " + figurePerimeter() + ", Area: " + figureArea());
        return null;
    }
}
