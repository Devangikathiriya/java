
public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void display() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        rect.display();
    }
}