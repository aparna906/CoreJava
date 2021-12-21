public class Square {
    int length;

    public Square(int l) {
        this.length = l;
    }

    public int area() {
        return (length * length);
    }


    public int perimeter() {
        return (length + length + length + length);
    }

}
