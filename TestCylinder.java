package edu.neu.INFO5100;

public class TestCylinder {
    public static void main(String[] args) {

        //Constructed a Circle with Circle()
        //Run of the program should produce the following output:
        //Radius is 2.0, Color is yellow, Base area is (your answer)
        Circle circle = new Circle(2.0, "yellow");
        System.out.printf("Radius is %s, Color is %s, Base area is %.2f.%n", circle.getRadius(),circle.getColor(),circle.getArea());
        //Constructed a Cylinder with Cylinder()
        //Run of the program should produce the following output:
        //Radius is 1.0, Height is 1.0, Color is red, Base area is (your answer), Volume is (your answer)
        Cylinder cylinder=new Cylinder(1.0,1.0,"red");
        System.out.printf("Radius is %s, Height is %s, Color is %s, Base area is %.2f, Volume is %.2f.%n", cylinder.getRadius(),cylinder.getHeight(),cylinder.getColor(),cylinder.getArea(),cylinder.getVolume());
        //Constructed a Cylinder with Cylinder(height, radius)
        //Run of the program should produce the following output:
        //Radius is 2.0, Height is 5.0, Color is red, Base area is (your answer), Volume is (your answer)

        Cylinder cylinderTwo=new Cylinder(5.0,2.0);
        System.out.printf("Radius is %s, Height is %s, Color is %s, Base area is %.2f, Volume is %.2f.%n", cylinderTwo.getRadius(), cylinderTwo.getHeight(),cylinderTwo.getColor(),cylinderTwo.getArea(),cylinderTwo.getVolume());
    }
}
