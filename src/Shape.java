public class Shape {
    private String color;
    protected double area=1.0;
    protected double base=1.0;
    protected double width=1.0;
    protected double height=1.0;

    //Constructs a Shape instance with only the color
    public Shape(String color) {
        this.color = color;
    }
    public Shape(){}
    public Shape(String color, double area, double base, double width, double height){
        this.color = color;
        this.area = area;
        this.base= base;
        this.width = width;
        this.height = height;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    // returns a self-descriptive string
    @Override
    public String toString() {
        return " Shape[color= " + color + "]";
    }

    // All shapes must provide a method named getArea
    public double getArea() {
        System.out.println("Shape unknown! Cannot compute area!");
        //we need to return some value to compile the program.
        return 0;
    }
    //pojo method
    public void displayShapName(){
        System.out.println("I am a Shape");
    }
}
