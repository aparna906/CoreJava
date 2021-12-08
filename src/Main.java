import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1.Circle");
            System.out.println("2.Triangle");
            System.out.println("3.Rectangle");
            System.out.println("Enter Your Choice");
            int n = scan.nextInt();

            switch (n) {
                //Calculate Area, Diameter, Circumference of Circle
                case 1:
                    System.out.println("Enter the Radius of the Circle");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle is : " + circle.area());
                    System.out.println("Diameter of Circle is : " + circle.diameter());
                    System.out.println("Circumference of Circle is : " + circle.circumference());
                    break;
                //Calculate Area and Perimeter of Triangle
                case 2:
                    System.out.println("Enter Base ");
                    int b = scan.nextInt();
                    System.out.println("Enter Height ");
                    int h = scan.nextInt();
                    System.out.println("Enter Side ");
                    int s = scan.nextInt();
                    Triangle triangle = new Triangle(b, h, s);
                    System.out.println("Area of Triangle is : " + triangle.area());
                    System.out.println("Diameter of Triangle is : " + triangle.perimeter());
                    break;

                //Calculate Area,Perimeter & Diagonal of Rectangle
                case 3:
                    System.out.println("Enter the Length");
                    int l = scan.nextInt();
                    System.out.println("Enter the Width");
                    int w = scan.nextInt();
                    Rectangle rectangle = new Rectangle(l,w);
                    System.out.println("Area of Rectangle is : " + rectangle.area());
                    System.out.println("Diameter of Rectangle is : " + rectangle.diagonal());
                    System.out.println("Perimeter of Rectangle is : " + rectangle.perimeter());
                    break;
            }
        }
    }
}
