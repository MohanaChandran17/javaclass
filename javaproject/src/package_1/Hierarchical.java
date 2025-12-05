package package_1;

class Shape 
{
    String color;

    Shape(String color) 
    {
        this.color = color;
    }

    void area() 
    {
        System.out.println("Area of shape:");
    }
}
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void area()
    {
        double a = Math.PI* radius * radius;
        System.out.println("Circle Color: " + color);
        System.out.println("Area of Circle: " + a);
    }
}
class Rectangle extends Shape 
{
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void area() {
        double a = length * width;
        System.out.println("Rectangle Color: " + color);
        System.out.println("Area of Rectangle: " + a);
    }
}

public class Hierarchical 
{
    public static void main(String[] args)
    {

        Circle obj1 = new Circle("Red", 5);
        Rectangle obj2= new Rectangle("Blue", 4, 6);

        obj1.area();
        System.out.println();
        obj2.area();
    }
}