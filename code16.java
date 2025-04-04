
class Car {
    void BMW() {
        System.out.println("Full form of BMW is Bayerische Motoren Werke");
    }
}

class MSeries extends Car {
    void perfect() {
        System.out.println("This plays a song");
    }
}

class ZSeries extends Car {
    void ride() {
        System.out.println("Nice ride");
    }
}

public class Main {
    public static void main(String[] args) {
        MSeries s = new MSeries();
        s.BMW();
        s.perfect();
    }
}