public class Cylinder {
    double height;
    double radius;

    // parameterized constructor
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double baseArea() {
        try {
            return (Math.PI * radius * radius); // return Base Area of shape Cylinder
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public double volume() {
        try {
            return (Math.PI * radius * radius * height); //return Volume of shape Cylinder
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public double surfaceArea() {
        try {
            return ((2 * 22 * radius) / 7) * (radius + height); //return Surface Area of shape Cylinder
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
