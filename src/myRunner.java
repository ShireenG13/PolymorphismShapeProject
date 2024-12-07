public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle: " + c.getArea());
        //declaration of object variable of the Shape class
        Shape sObj = new Shape();
        sObj.displayShapName();
        System.out.println(sObj instanceof Shape);

        //Object creation of the circle class
        //Object Typecasting
        System.out.println( "++++++++++");
        Shape shapeCircleObject = new Circle(100); //Upcasting
        shapeCircleObject.displayShapName();
        System.out.println("Area of Circle: " + shapeCircleObject.getArea());
        System.out.println(shapeCircleObject); //runs toString method of Circle class
        System.out.println(shapeCircleObject instanceof Circle); //true
        System.out.println(sObj instanceof Circle); //false
        System.out.println( "_________________");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayShapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle: " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
        System.out.println(shapeRectangleObj instanceof Rectangle);
        System.out.println(sObj instanceof Rectangle);
    }
}
