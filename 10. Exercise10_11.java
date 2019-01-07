package exercise10_11;

public class Exercise10_11 {

  public static void main(String[] args) {
      
    Circle2D c1 = new Circle2D(2, 2, 5.5);
    System.out.println("Area is " + c1.getArea());
    System.out.println("Perimeter is " + c1.getPerimeter());
    System.out.println(c1.contains(3, 3));
    System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
    System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
  }
}

class Circle2D {
  private double x;
  private double y;
  
  private double radius;

public double getX() {
    return x;
}  
public double getY() {
    return y;
}
public double getRadius() {
    return radius;
}

//no-arg constructor for default circle
Circle2D() {
x = 0;
y = 0;
radius = 1;
}
// constructor for a circle with specified x, y and radius
Circle2D(double newX, double newY, double newRadius) {   
this.x = newX;
this.y = newY;
this.radius = newRadius;
}

//returns the area of the circle
public double getArea() {
    return this.radius * this.radius * Math.PI;
}

//getPerimeter method that returns the preimeter of the circle
public double getPerimeter() {
    return 2 * Math.PI * this.radius;
}

//returns true if the specified point (x, y) is inside the circle
public boolean contains(double x, double y) {
   if (Math.sqrt((x - this.x) * 2 + (y - this.y) * 2) < this.radius) {  
        return true;
    }
   else {
        return false;           
    }
}
//returns true if the specified circle is inside the circle
public boolean contains(Circle2D circle) {
    double distance = Math.sqrt((x - this.x) * 2 + (y - this.y) * 2);
    if (this.radius > distance + radius) {
        return true;
    }
    else {
        return false;
    }
}
//returns true if the specified circle overlaps with the circle
public boolean overlaps(Circle2D circle) {
    double distance = Math.sqrt((x - this.x) * 2 + (y - this.y) * 2);
    if (distance > this.radius + radius) {
        return true;
    }
    else {
        return false;
    }
  }
}