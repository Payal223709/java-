public abstract class Shape {
    String color;
    abstract double area();


     public abstract String toString();
    public Shape(String color)
    {
      System.out.println("Shape consuctor");
    
    
    }
}

public String getColor()





class Circle extends Shape{
    double radius;
    public Circle(String color,double radius){
        Super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
{
    
}


