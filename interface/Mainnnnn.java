
interface Polygon {
    
    default double getPerimeter() {
        return 0.0; 
    }
    
    
    double getArea();
}


class Rectangle implements Polygon {
    private double length;
    private double width;
    
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}


class Circle implements Polygon {
    private double radius;
    
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
   
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle implements Polygon {
    private double side1, side2, side3;
    
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class Mainnnnn {
    public static void main(String[] args) {
        
        Polygon[] polygons = {
            new Rectangle(5, 3),
            new Circle(4),
            new Triangle(3, 4, 5)
        };

        
        for (Polygon polygon : polygons) {
            System.out.println("Polygon: " + polygon.getClass().getSimpleName());
            System.out.println("Perimeter: " + polygon.getPerimeter());
            System.out.println("Area: " + polygon.getArea());
            System.out.println();
        }
    }
}
