package assignment4;

import java.util.Scanner; // considering for taking input from user 

//Subclass Cylinder inheriting Properties of Class ThreeDimensionalShape
public class Cylinder extends ThreeDimensionalShape {
    
	// initializing variables 
	private double radius;
    private double height;

    
 // method for taking input for radius and height 
    @Override
    public void readShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius & height: ");
        radius = scanner.nextDouble();
        height = scanner.nextDouble();
    }

 // method for computing volume 
    @Override
    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }

 // method for computing Surface Area
    @Override
    public double computeSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

 // method for displaying results
    @Override
    public void displayShape() {
        System.out.println("Shape: Cylinder");
        System.out.println("Radius : " + radius);
        System.out.println("Height : " + height);
        System.out.println("Surface Area : " + computeSurfaceArea());
        System.out.println("Volume : " + computeVolume());
    }
}
