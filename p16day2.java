class Car {
    int mileage;
    String color;
    int model;

    // Constructor
    Car(int mi, String co, int mo) {
        mileage = mi;
        color = co;
        model = mo;
    }

    void startCar() {
        System.out.println("Press Start Button");
        System.out.println("Car Started");
    }

    void stopCar() {
        System.out.println("Turn off the key");
        System.out.println("Car Stopped");
    }
}

public class p16day2 {
    public static void main(String[] args) {
        Car c1 = new Car(15, "white", 2025);

        System.out.println(c1.color);
        c1.startCar();
        c1.stopCar();
    }
}