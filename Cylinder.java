package edu.neu.INFO5100;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * this.getRadius() * this.getRadius() * this.height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + Math.PI * 2 * this.getRadius() * height;
    }
}
