package assignment4;
import java.util.Scanner; // considering for taking input from user  


// considering the Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// for considering user input
        Shape shape;

        // displaying options for user to select the type of shape he is interested in
        while (true) {
            System.out.println("Enter\n1 for Circle\n2 for Square\n3 for Rectangle\n4 for Cube\n5 for Sphere\n6 for Cylinder");
            int choice = scanner.nextInt();

            shape = getShape(choice);
            if (shape == null) {
                break;
            }

            processShape(shape);
        }
    }

    // Considering Switch for choosing the right option 
    private static Shape getShape(int choice) {
        switch (choice) {
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Rectangle();
            case 4:
                return new Cube();
            case 5:
                return new Sphere();
            case 6:
                return new Cylinder();
            default:
                return null;
        }
    }

    // Considering the method process shape so that it can be called in the Main method
    private static void processShape(Shape shape) {
        shape.readShape();
        shape.displayShape();
    }
}


