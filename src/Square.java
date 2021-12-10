public class Square {
    int length;

    // Parameterized constructor
    public Square(int length) {
        this.length = length;
    }

    public int area() {
        try {
            return (length * length); // return Area of shape Square
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int perimeter() {
        try {
            return (length + length + length + length); // return Perimeter of shape Square
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
