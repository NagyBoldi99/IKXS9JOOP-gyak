package model;

public class Cylinder extends Prism{

	private double radius;

    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", area=" + getArea() + ", volume=" + getVolume() + ", height="
                + getHeight() + "]";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
	
}
