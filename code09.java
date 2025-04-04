

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("counter: " + count);
    }

    static void show() {
        System.out.println("total count: " + count);
    }
}

public class Static {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        Counter.show();
    }
}