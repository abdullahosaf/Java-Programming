package assignment4;

import java.util.Scanner;  // considering for taking input from user

// Subclass Rectangle inheriting Properties of Class TwoDimensionalShape
public class Rectangle extends TwoDimensionalShape {
    // initializing variables 
	private double length;
    private double width;

    // method for taking inputs for length and width 
    @Override
    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        length = scanner.nextDouble();
        width = scanner.nextDouble();
    }

    // method for computing area
    @Override
    public double computeArea() {
        return length * width;
    }

    // method for computing perimeter 
    @Override
    public double computePerimeter() {
        return 2 * (length + width);
    }

    // method for displaying results
    @Override
    public void displayShape() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Area : " + computeArea());
        System.out.println("Perimeter: " + computePerimeter());
    }
}
