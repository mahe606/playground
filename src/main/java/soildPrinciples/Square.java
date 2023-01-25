package soildPrinciples;

public class Square implements Shape {
    private double side;

    public Square(double side) {
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
        double area = Math.pow(side, 2);
        System.out.println("Area of square is " + area);
        return area;
    }
}
