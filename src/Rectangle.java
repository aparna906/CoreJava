public class Rectangle {
      int length;
      int width;

      public Rectangle(int l,int w){
          this.length = l;
          this.width = w;
      }

      public int area(){
          return(length * width);
      }

      public double diagonal(){
          return(Math.sqrt(Math.pow(width,2)+Math.pow(width,2)));
      }

      public int perimeter(){
          return(2*(length*width));
      }
}
