
public class MaxOfThree {
    public static void main(String[] args) {
        int a = 25;
        int b = 42;
        int c = 37;
        int max;

        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("The maximum number is: " + max);
    }
}
