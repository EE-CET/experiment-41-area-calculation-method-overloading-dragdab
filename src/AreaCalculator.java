import java.util.Scanner;

public class AreaCalculator {

   
    public void calculateArea(float radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f%n", area);
    }

    
    public void calculateArea(float length, float breadth) {
        float area = length * breadth;
        System.out.printf("Area of Rectangle: %.2f%n", area);
    }

    
    public void calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle: %.2f%n", area);
    }
}



    public static void main(String[] args) {
    
         Scanner scanner = new Scanner(System.util.in);
        AreaCalculator ac = new AreaCalculator();

        // 1. Input for Circle
        float radius = scanner.nextFloat();
        ac.calculateArea(radius);

        // 2. Input for Rectangle
        float length = scanner.nextFloat();
        float breadth = scanner.nextFloat();
        ac.calculateArea(length, breadth);

        // 3. Input for Triangle
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        ac.calculateArea(base, height);

        scanner.close();
    }

    

