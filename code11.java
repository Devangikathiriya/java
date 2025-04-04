
class Shape {
    float area(float radius) {
        return 3.14f * radius * radius;
    }

    float area(float length, float width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        
        float circleArea = s1.area(5.0f);
        float rectangleArea = s1.area(4.0f, 6.0f);

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}