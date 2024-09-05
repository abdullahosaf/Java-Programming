package assignment4;

import java.util.Scanner; // considering for taking input from user

//Subclass Circle inheriting Properties of Class TwoDimensionalShape
public class Circle extends TwoDimensionalShape {
	// initializing variable
	private double radius;

	// method for taking input radius
	@Override
    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
    }

	// method for computing area
	@Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

	// method for computing perimeter 
	@Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

	// method for displaying results
	@Override
    public void displayShape() {
        System.out.println("Shape: Circle");
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + computeArea());
        System.out.println("Perimeter: " + computePerimeter());
    }
}

