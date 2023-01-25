package soildPrinciples;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(4);
        Cube cube = new Cube(8);
        AreaCalculator areaCalculator = new AreaCalculator();
        List<Shape> shapes = List.of(square, circle, cube);
        System.out.println(areaCalculator.calculateArea(shapes));
    }
}
