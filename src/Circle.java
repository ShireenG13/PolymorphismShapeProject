public class Circle extends Shape{
    protected double radius;
    private final double PI = Math.PI;

    //Constructors
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }

    //getArea method
    public double getArea(){
        super.area = PI * (Math.pow(this.radius, 2)); //inititalizing value in parent class variable
        return super.area; // reference to parent class variable
    }
    @Override
    public void displayShapName(){
        System.out.println("Drawing a Circle of radius : " + this.radius);
    }

    //Returns a self- descriptive string
    @Override
    public String toString(){
        return "Circle of radius [ " + this.radius + super.toString() + " ]";
    }
}
