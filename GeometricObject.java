/*************************************
Timothy McWatters
COP4331 - OO Programming
Programming Project 1

1 of 4 .java files
***GeometricObject.java
Circle.java
Rectangle.java
testGeometricObjects.java

The objective of this project is to design 
the classes to model the drawing geometric objects 
such as circles and rectangles.
*************************************/

import java.util.Date;

/*************************************
class GeometricObject
   Base (or super) class to model the geometric objects.
   -- will have subclasses Circle and Rectangle.
**************************************/
public abstract class GeometricObject {
   private String color;
   private boolean filled;
   private Date dateCreated = new Date();
   
   /*************************************
   GeometricObject constructor
   constructor to set default cases for class 
   GeometricObject instanced variables.
   **************************************/
   GeometricObject() {
      this.color = "white";
      this.filled = false;
   }
   
   /*************************************
   getColor method
   returns value of color when called.
   **************************************/
   public String getColor() {
      return this.color;
   }
   
   /*************************************
   setColor method
   sets the value of color to what was passed 
   as the parameter when called.
   **************************************/
   public void setColor(String color) {
      this.color = color;
   }
   
   /*************************************
   getFilled method
   returns value of filled when called.
   **************************************/   
   public boolean getFilled() {
      return this.filled;
   }
   
   /*************************************
   setFilled method
   sets the value of filled to what was passed 
   as the parameter when called.
   **************************************/   
   public void setFilled(boolean filled) {
      this.filled = filled;
   }
   
   /*************************************
   getDateCreated method
   returns the current date when called.
   **************************************/
   public String getDateCreated() {
      return dateCreated.toString();
   }   
   
   /*************************************
   toString method
   returns a string representation of the object
   **************************************/
   public String toString() {
      return (" created on " + dateCreated + "\n" + "color: " + color + " and filled: " + filled);
   }

}
