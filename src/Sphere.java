public class Sphere {
    double radius;

    public Sphere(double r){
        this.radius = r;
    }

    public double area(){
        return(4 * Math.PI *radius * radius);
    }

    public double diameter(){
        return(2 * radius);
    }

}
