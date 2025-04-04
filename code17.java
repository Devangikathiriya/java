

class Student {
    void behavior() {
        System.out.println("Decent");
    }
}

class NewStudent extends Student {
    void move() {
        System.out.println("Mischievous");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.behavior();

        NewStudent behavior = new NewStudent();
        behavior.behavior();
        behavior.move();
    }
}