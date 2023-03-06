package figures;

import figureData.ColorsSelection;
import figureData.SizeData;


public class BuildTriangle implements BuildFigure {
    static SizeData sizeData = new SizeData();
    private static double base = sizeData.randomBase();
    private static double height = sizeData.randomHeight();
    @Override
    public String figureName() {
        return "Triangle";
    }

    @Override
    public String figureColor() {
        ColorsSelection colorsSelection = new ColorsSelection();
        return colorsSelection.getRandomColor();
    }

    @Override
    public double figurePerimeter() {
        return base + height + Math.sqrt(base * height + base * height);
    }

    @Override
    public double figureArea() {
        return 0.5 * height * base;
    }

    @Override
    public String build() {
        System.out.println("I'm building a Triangle....");
        return null;
    }
    public String toString(){
        System.out.println("Figure: " + figureName() + ", Color: " + figureColor() + ", Perimeter: " + figurePerimeter() + ", Area: " + figureArea());
        return null;
    }
}
