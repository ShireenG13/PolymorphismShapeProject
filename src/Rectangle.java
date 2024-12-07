public class Rectangle extends Shape{

    //Constructors
    public Rectangle(){}
    public Rectangle(String color){}
    public Rectangle(String color, double area, double base, double width, double height) {
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
    @Override
    public double getArea() {
        return width * height;
    }

    public double Perimeter(){
        super.area = super.width * super.height;
        return super.area;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Rectangle[height=" + height + " ,width=" + width + super.toString() + "]";
    }

    @Override
    public void displayShapName() {
        System.out.println("I am a Rectangle");
    }

}
