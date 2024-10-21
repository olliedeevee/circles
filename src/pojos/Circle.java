package pojos;
import java.lang.Math.*;

public class Circle {
    public double radius;
//    Could I do something like this?
//    public double diameter = calculateDiameter();
//    public double circumference = calculateCircumference();
//    public double area = calculateArea();
    public double diameter;
    public double circumference;
    public double area;

    public double calculateCircumference(){
        return diameter * Math.PI;
    }
    public double calculateDiameter(){
        return (radius * 2);
    }
    public double calculateArea(){
        return ((radius * radius) * Math.PI);
    }
    public Circle(double radius){
        this.radius = radius;
        this.diameter = calculateDiameter();
        this.circumference = calculateCircumference();
        this.area = calculateArea();
    }
//    d = 2r
//    C = 2πr
//    A = πr2
}
