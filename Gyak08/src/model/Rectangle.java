package model;

public class Rectangle extends Prism{

	double a;
    double b;

    public Rectangle(double a, double b, double height) {
        super(height);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle [a=" + a + ", b=" + b + ", area=" + getArea() + ", volume=" + getVolume() + ", height="
                + getHeight() + "]";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
	
}
