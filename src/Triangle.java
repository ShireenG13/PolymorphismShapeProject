public class Triangle extends Shape{
    //constructors
    public Triangle(){
    }
    public Triangle(String color){
        super(color);
    }
    public Triangle(String color, double area, double base, double width, double height){
        super(color, area, base, width, height);
    }

    @Override
    public void setBase(double base) {
        super.base = base;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
    }

    public double getArea(){
        return 0.5*base*height;
    }

    @Override
    public void displayShapName(){
        System.out.println("I am a Triangle");
    }

    @Override
    public String toString(){
        return "Triangle[ Base=" + base + " Height= "+ super.toString() + "]";
    }

}
