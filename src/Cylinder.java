public class Cylinder {
    double height;
    double radius;

    public Cylinder(double h, double r) {
        this.height = h;
        this.radius = r;
    }

    public double baseArea() {
        return (Math.PI * radius * radius);
    }

    public double volume() {
        return (Math.PI * radius * radius * height);
    }

    public double surfaceArea() {
        return ((2 * 22 * radius) / 7) * (radius + height);
    }

}
