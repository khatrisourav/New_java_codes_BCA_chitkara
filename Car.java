public class Car {

    private String color;
    private int speed;

    public Car setColor(String color) {
        this.color = color;
        System.out.println("setColor called on object at: " + this);
        return this;  // return current object reference
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        System.out.println("setSpeed called on object at: " + this);
        return this;  // return current object reference
    }

    public void display() {
        System.out.println("Car color: " + color + ", speed: " + speed);
    }

    public static void main(String[] args) {
        Car car1 = new Car();

        System.out.println("car1 object at: " + car1);

        // Method chaining: calls setColor, then setSpeed on the SAME object
        car1.setColor("Black").setSpeed(400).display();

        // Display final state
        
    }
}

