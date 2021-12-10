public class Triangle {
    int base;
    int height;
    int side;

    // Parameterized constructor
    public Triangle(int base, int height, int side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public int area() {
        try {
            return (height * base) / 2; //return Area of shape Triangle
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int perimeter() {
        try {
            return (height + base + side); //return Perimeter of shape Triangle
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
