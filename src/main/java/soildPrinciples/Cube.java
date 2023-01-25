package main.java.soildPrinciples;

public class Cube implements Shape, ThreeDShape{

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        double area = Math.pow(side,2);
        System.out.println("Area of Cube is " + area);
        return area;
    }

    @Override
    public double volume() {
        return Math.pow(side,3);
    }
}
