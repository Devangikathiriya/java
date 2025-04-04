
interface Speaker {
    void speak();
}

interface Runner {
    void run();
}

interface Gamer {
    void game();
}

class Evva implements Speaker, Runner, Gamer {
    public void speak() {
        System.out.println("Evva is speaking");
    }

    public void run() {
        System.out.println("Evva is running");
    }

    public void game() {
        System.out.println("Evva plays the game");
    }
}

public class Main {
    public static void main(String[] args) {
        Evva robo = new Evva();
        robo.speak();
        robo.run();
        robo.game();
    }
}