package figures;

import figureData.ColorsSelection;
import figureData.SizeData;


public class BuildRectangle implements BuildFigure {
    static SizeData sizeData = new SizeData();
    private static double width = sizeData.randomWidth();
    private static double length = sizeData.randomLength();
    @Override
    public String figureName() {
        return "Rectangle";
    }

    @Override
    public String figureColor() {
        ColorsSelection colorsSelection = new ColorsSelection();
        return colorsSelection.getRandomColor();
    }

    @Override
    public double figurePerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double figureArea() {
        return width * length;
    }

    @Override
    public String build() {
        System.out.println("I'm building a Rectangle....");
        return null;
    }
    public String toString(){
        System.out.println("Figure: " + figureName() + ", Color: " + figureColor() + ", Perimeter: " + figurePerimeter() + ", Area: " + figureArea());
        return null;
    }
}
