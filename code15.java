

class Car {
    void sound() {
        System.out.println("It makes a happy sound");
    }
}

class BMW extends Car {
    void model() {
        System.out.println("M5 CS");
    }
}

class KIA extends BMW {
    void speed() {
        System.out.println("Top speed 300+ kmph");
    }
}

public class Main {
    public static void main(String[] args) {
        KIA k = new KIA();
        k.sound();
        k.model();
        k.speed();
    }
}