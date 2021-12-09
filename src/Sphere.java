public class Sphere {
    double radius;

    public Sphere(double r) {
        this.radius = r;
    }

    public double area() {
        try {
            return (4 * Math.PI * radius * radius);
        } catch (ArithmeticException c) {
            c.getMessage();
            return (0.0);
        }
    }

    public double diameter() {
        try {
            return (2 * radius);
        } catch (ArithmeticException c1) {
            c1.getMessage();
            return (0.0);
        }
    }
}
