package main.java.soildPrinciples;

import java.util.List;

public class AreaCalculator {
    public int calculateArea(List<Shape> shapes){
        int sum = 0;
        for (Shape shape: shapes) {
            sum+=shape.area();
        }
        return sum;
    }
}
