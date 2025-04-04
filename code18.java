


class Car {
    private int topSpeed;
    private String name;

    public Car(int topSpeed, String name) {
        this.topSpeed = topSpeed;
        this.name = name;
    }

    public void display() {
        System.out.println(name + " has a top speed of " + topSpeed + " km/h");
    }

    public static void main(String[] args) {
        Car[] cars = {
            new Car(250, "Ferrari"),
            new Car(220, "Lamborghini"),
            new Car(200, "Porsche"),
            new Car(180, "Tesla"),
            new Car(240, "Bugatti")
        };

        for (Car car : cars) {
            car.display();
        }
    }
}