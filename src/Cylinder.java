public class Cylinder extends Circle{

    private final double PI = Math.PI;

    //Constructors
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double radius,  double height) {
        super(radius, height);
    }

    public double getVolume() {
        return PI * Math.pow(super.radius,2) * super.height;
    }

    public double getSurfaceArea() {
        return (2 * PI * super.radius) * super.height;
    }

    public void displayShapName(){
        System.out.println("Drawing a Cylinder of radius: " + super.radius);
    }

    public String toString(){
        return "Cylinder of radius: " + super.radius + "and height: " + super.height;
    }
}
