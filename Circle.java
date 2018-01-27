/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 1

1 of 4 .java files
GeometricObject.java
***Circle.java
Rectangle.java
testGeometricObjects.java

The objective of this project is to design 
the classes to model the drawing geometric objects 
such as circles and rectangles.
*************************************/

/*************************************
class Circle
   Subclass to the GeometricObject super class. 
   Contains fields and methods specific to the
   Circle class.
**************************************/
public class Circle extends GeometricObject {
   private double radius;
   
   /*************************************
   Circle constructor
   constructor to set default cases for class 
   Circle instanced variables.
   **************************************/
   Circle() {
      this.radius = 0.0;
   }
   
   /*************************************
   getRadius method
   returns value of radius when called.
   **************************************/
   public double getRadius() {
      return this.radius;
   }   
   
   /*************************************
   setRadius method
   sets the value of radius to what was passed 
   as the parameter when called.
   **************************************/
   public void setRadius(double radius) {
      this.radius = radius;
   }   
   
   /*************************************
   getArea method
   calculates and returns the area when called.
   **************************************/
   public double getArea() {
      return (Math.pow(radius, 2) * Math.PI);
   }   
   
   /*************************************
   getPerimeter method
   calculates and returns the perimeter when called.
   **************************************/
   public double getPerimeter() {
      return (8 * Math.PI * radius);
   }  
   
   /*************************************
   getDiameter method
   calculates and returns diameter when called.
   **************************************/
   public double getDiameter() {
      return (2 * radius);
   }  
   
   /*************************************
   toString method (overrides the super class's toString)
   returns a string representation of the object
   **************************************/
   @Override
   public String toString() {
      return ("A circle" + super.toString());
   }

}
