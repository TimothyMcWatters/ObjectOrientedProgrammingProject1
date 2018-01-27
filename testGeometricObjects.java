/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 1

1 of 4 .java files
GeometricObject.java
Circle.java
Rectangle.java
***testGeometricObjects.java

The objective of this project is to design 
the classes to model the drawing geometric objects 
such as circles and rectangles.
*************************************/

/*************************************
class testGeometricObjects
   The test class for the GeometricObject, Circle,
   and Rectangle classes. This class is designed 
   for a specific output as outlined in project 1's
   directions.
**************************************/
public class testGeometricObjects {

   public static void main(String[] args) {
      Circle circle1 = new Circle(); // Creates a new instance of Circle
      Rectangle rectangle1 = new Rectangle(); // Creates a new instance of Rectangle
      
      // Tests the Circle class and its superclass 
      circle1.setRadius(1.0);
      System.out.println(circle1.toString());
      System.out.println("The color is " + circle1.getColor());
      System.out.println("the radius is " + circle1.getRadius());
      System.out.println("The area is " + circle1.getArea());
      System.out.println("The diameter is " + circle1.getDiameter());
      System.out.println();
      
      // Tests the Rectangle class and its superclass
      rectangle1.setWidth(2.0);
      rectangle1.setHeight(4.0);
      System.out.println(rectangle1.toString());
      System.out.println("The area is " + rectangle1.getArea());
      System.out.println("The perimeter is " + rectangle1.getPerimeter());
   } 
}
