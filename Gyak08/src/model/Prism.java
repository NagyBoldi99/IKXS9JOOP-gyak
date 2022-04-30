package model;

public abstract class Prism {

	private double height;

    public abstract double getArea();

    public double getVolume() {
        return height * getArea();
    }

    public Prism(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
	
}
