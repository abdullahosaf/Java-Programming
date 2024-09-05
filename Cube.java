package assignment4;

import java.util.Scanner; // considering for taking input from user

//Subclass Cube inheriting Properties of Class ThreeDimensionalShape
public class Cube extends ThreeDimensionalShape {
	// initializing variable
	private double side;

	// method for taking input side
	@Override
    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = scanner.nextDouble();
    }

	// method for computing volume
	@Override
    public double computeVolume() {
        return Math.pow(side, 3);
    }

	// method for computing Surface Area
	@Override
    public double computeSurfaceArea() {
        return 6 * side * side;
    }

	// method for displaying results
	@Override
    public void displayShape() {
        System.out.println("Shape: Cube");
        System.out.println("Side : " + side);
        System.out.println("Surface Area : " + computeSurfaceArea());
        System.out.println("Volume : " + computeVolume());
    }
}