public class Sphere {
    double radius;

    // Parameterized constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        try {
            return (4 * Math.PI * radius * radius);
        } catch (ArithmeticException c) {
            c.printStackTrace();
            return (0.0);
        }
    }

    public double diameter() {
        try {
            return (2 * radius);
        } catch (ArithmeticException c1) {
            c1.printStackTrace();
            return (0.0);
        }
    }
}
