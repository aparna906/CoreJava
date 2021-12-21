public class Triangle {
    int base;
    int height;
    int side;

    public Triangle(int b, int h, int s) {
        this.base = b;
        this.height = h;
        this.side = s;
    }

    public int area(){
        return(1*height*base)/2;
    }

    public int perimeter(){
        return(height+base+side);
    }

}
