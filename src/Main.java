import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println(" ");
                System.out.println("Your Options :");
                System.out.println("1.Circle");
                System.out.println("2.Triangle");
                System.out.println("3.Rectangle");
                System.out.println("4.Square");
                System.out.println("5.Cylinder");
                System.out.println("6.Sphere");
                System.out.println("7.Exit");
                System.out.println("Enter Your Choice");
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                switch (n) {
                    //Calculate Area, Diameter, Circumference of Circle
                    case 1:
                        double circleRadius;
                        System.out.println("Enter the Radius of the Circle");
                        try {
                            circleRadius = scan.nextDouble();
                            Circle circle = new Circle(circleRadius);
                            System.out.println("Area of Circle is : " + circle.area());
                            System.out.println("Diameter of Circle is : " + circle.diameter());
                            System.out.println("Circumference of Circle is : " + circle.circumference());
                        } catch (InputMismatchException e) {
                            System.out.println("Should be a valid number");
                        }
                        break;

                    //Calculate Area and Perimeter of Triangle
                    case 2:
                        int base, height, side;
                        try {
                            System.out.println("Enter the Base of Triangle ");
                            base = scan.nextInt();
                            System.out.println("Enter the Height of Triangle ");
                            height = scan.nextInt();
                            System.out.println("Enter the Side of Triangle ");
                            side = scan.nextInt();
                            Triangle triangle = new Triangle(base, height, side);
                            System.out.println("Area of Triangle is : " + triangle.area());
                            System.out.println("Diameter of Triangle is : " + triangle.perimeter());
                        } catch (InputMismatchException e) {
                            System.out.println("Should be a valid number");
                        }
                        break;

                    //Calculate Area,Perimeter & Diagonal of Rectangle
                    case 3:
                        int rectangleLength, RectangleWidth;
                        try {
                            System.out.println("Enter the Length of Rectangle");
                            rectangleLength = scan.nextInt();
                            System.out.println("Enter the Width of Rectangle");
                            RectangleWidth = scan.nextInt();
                            Rectangle rectangle = new Rectangle(rectangleLength, RectangleWidth);
                            System.out.println("Area of Rectangle is : " + rectangle.area());
                            System.out.println("Diameter of Rectangle is : " + rectangle.diagonal());
                            System.out.println("Perimeter of Rectangle is : " + rectangle.perimeter());
                        } catch (InputMismatchException e) {
                            System.out.println("Should be a valid number");
                        }
                        break;

                    //Calculate Area and Perimeter of Square
                    case 4:
                        int squareLength;
                        try {
                            System.out.println("Enter the Length of Square");
                            squareLength = scan.nextInt();
                            Square square = new Square(squareLength);
                            System.out.println("Area of Square is : " + square.area());
                            System.out.println("Perimeter of Square is : " + square.perimeter());
                        } catch (InputMismatchException e) {
                            System.out.println("Should be a valid number");
                        }
                        break;

                    //Calculate Base Area,Surface Area and Volume of Cylinder
                    case 5:
                        double cylinderHeight, cylinderRadius;
                        try {
                            System.out.println("Enter the Height of Cylinder");
                            cylinderHeight = scan.nextDouble();
                            System.out.println("Enter the Radius of Cylinder");
                            cylinderRadius = scan.nextDouble();
                            Cylinder cylinder = new Cylinder(cylinderHeight, cylinderRadius);
                            System.out.println("Base Area of Cylinder is : " + cylinder.baseArea());
                            System.out.println("Volume of Cylinder is : " + cylinder.volume());
                            System.out.println("Surface Area of Cylinder is : " + cylinder.surfaceArea());
                        } catch (InputMismatchException e) {
                            System.out.println("Should be a valid number");
                        }
                        break;

                    //Calculate Area and Diameter of Sphere
                    case 6:
                        double sphereRadius1;
                        try {
                            System.out.println("Enter the Radius of Sphere");
                            sphereRadius1 = scan.nextDouble();
                            Sphere sphere = new Sphere(sphereRadius1);
                            System.out.println("Area of Sphere is : " + sphere.area());
                            System.out.println("Area of Sphere is : " + sphere.diameter());
                        } catch (InputMismatchException e) {
                            System.out.println("Should be a valid number");
                        }
                        break;

                    case 7:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Enter the Valid Option");
                        break;

                } //(Switch close)
            } // (while close)
        } catch (InputMismatchException e) {
            System.out.println("Invalid");
        }
    }
}
