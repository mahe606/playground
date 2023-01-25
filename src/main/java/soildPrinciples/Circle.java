package soildPrinciples;



public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle is " + area);
        return area;
    }
}
