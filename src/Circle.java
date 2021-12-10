public class Circle {
    double radius;

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        try {
            return (22 * radius * radius) / 7; // return Area of shape Circle
        } catch (ArithmeticException c) {
            c.printStackTrace();
            return 0;
        }
    }

    public double diameter() {
        try {
            return (2 * radius); // return Diameter of shape Circle
        } catch (ArithmeticException c) {
            c.printStackTrace();
            return 0;
        }
    }

    public double circumference() {
        try {
            return (2 * 22 * radius) / 7; // return Circumference of shape Circle
        } catch (ArithmeticException c) {
            c.printStackTrace();
            return 0;
        }
    }
}
