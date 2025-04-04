
class MyException extends Exception {
    String detail;

    MyException(String s) {
        detail = s;
    }

    public String toString() {
        return detail;
    }
}

public class Student {
    public static void main(String[] args) {
        try {
            throw new MyException("Divide by zero");
        } catch (MyException e) {
            System.out.println("Caught: " + e);
        }
    }
}