public class Rectangle {
    int length;
    int width;

    //Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        try {
            return (length * width); //return Area of shape Rectangle
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public double diagonal() {
        try {
            return (Math.sqrt(Math.pow(width, 2) + Math.pow(width, 2))); //return Diagonal of shape Rectangle
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public int perimeter() {
        try {
            return (2 * (length * width)); ////return Perimeter of shape Rectangle
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
