public class Circle {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double area() {
        return (22 * radius * radius) / 7;
    }

    public double diameter() {
        return (2 * radius);
    }

    public double circumference() {
        return (2 * 22 * radius) / 7;
    }
}
