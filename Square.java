package assignment4;

import java.util.Scanner; // considering for taking input from user


//Subclass Square inheriting Properties of Class TwoDimensionalShape
public class Square extends TwoDimensionalShape {
	// initializing variable
	private double side;

	// method for taking input side
	@Override
    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = scanner.nextDouble();
    }

	// method for computing area
	@Override
    public double computeArea() {
        return side * side;
    }

	// method for computing perimeter 
	@Override
    public double computePerimeter() {
        return 4 * side;
    }

	// method for displaying results
	@Override
    public void displayShape() {
        System.out.println("Shape: Square");
        System.out.println("Side : " + side);
        System.out.println("Area : " + computeArea());
        System.out.println("Perimeter: " + computePerimeter());
    }
}
