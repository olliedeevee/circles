package main;

import java.util.Scanner;
import pojos.Circle;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your radius, and we will tell you the " +
                "diameter, circumference, and area ");
        var circleRadius = scanner.nextDouble();

        var circle = new Circle(circleRadius);

        System.out.println("Your circle: " + circle.radius + "radius\n" +
                circle.area +" area\n" +
                circle.diameter +" diameter\n" +
                circle.circumference + " circumference\n"
        );
    }
}
