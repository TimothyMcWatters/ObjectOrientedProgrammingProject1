/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 1

1 of 4 .java files
GeometricObject.java
Circle.java
***Rectangle.java
testGeometricObjects.java

The objective of this project is to design 
the classes to model the drawing geometric objects 
such as circles and rectangles.
*************************************/

/*************************************
class Rectangle
   Subclass to the GeometricObject super class. 
   Contains fields and methods specific to the
   Rectangle class.
**************************************/
public class Rectangle extends GeometricObject {
   private double width;
   private double height;
   
   /*************************************
   Rectangle constructor
   constructor to set default cases for class 
   Rectangle instanced variables.
   **************************************/
   Rectangle() {
      this.width = 0.0;
      this.height = 0.0;
   } 
   
   /*************************************
   getWidth method
   returns the width when called.
   **************************************/
   public double getWidth() {
      return this.width;
   }
   
   /*************************************
   setWidth method
   sets the value of width to what was passed 
   as the parameter when called.
   **************************************/  
   public void setWidth(double width) {
      this.width = width; 
   }  
   
   /*************************************
   getHeight method
   returns the height when called.
   **************************************/
   public double getHeight() {
      return this.height;
   } 
   
   /*************************************
   setHeight method
   sets the value of height to what was passed 
   as the parameter when called.
   **************************************/
   public void setHeight(double height) {
      this.height = height; 
   }
   
   /*************************************
   getArea method
   calculates and returns area when called.
   **************************************/
   public double getArea() {
      return (height * width);
   }   
   
   /*************************************
   getPerimeter method
   calculates and returns perimeter when called.
   **************************************/
   public double getPerimeter() {
      return (2 * (height + width));
   } 
   
   /*************************************
   toString method (overrides the super class's toString)
   returns a string representation of the object
   **************************************/ 
   @Override
   public String toString() {
      return ("A rectangle" + super.toString());
   }

}
