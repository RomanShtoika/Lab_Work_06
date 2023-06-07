abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void brake();

    public void gas() {
        System.out.println("Accelerating!");
    }
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Sedan is braking!");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Truck is braking!");
    }
}

public class Exercise_4 {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Honda Civic", "White", 210);
        Truck truck = new Truck("Chevrolet Silverado", "Red", 180);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }
}
