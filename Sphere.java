package assignment4;

import java.util.Scanner; // considering for taking input from user

//Subclass Sphere inheriting Properties of Class ThreeDimensionalShape
public class Sphere extends ThreeDimensionalShape {
	// initializing variable
	private double radius;

    // method for taking input for radius 
    @Override
    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
    }

    
 // method for computing volume 
    @Override
    public double computeVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

 // method for computing Surface Area
    @Override
    public double computeSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

 // method for displaying results
    @Override
    public void displayShape() {
        System.out.println("Shape: Sphere");
        System.out.println("Radius : " + radius);
        System.out.println("Surface Area : " + computeSurfaceArea());
        System.out.println("Volume : " + computeVolume());
    }
}
