
public class Car {
    // Attributes / fields of the class
    private String make;
    private String model;
    private String year;

    // Constructor to initialize the object
    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Display methods
    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public String startEngine() {
        return "Engine started";
    }

    public static void main(String[] args) {
        Car objname = new Car("Toyota", "Corolla", "2023");
        objname.display();
        System.out.println(objname.startEngine());
    }
}