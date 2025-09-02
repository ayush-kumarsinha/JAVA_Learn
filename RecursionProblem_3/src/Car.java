//53. Create a class Car with attributes brand and model. Create an object of this class and print the details.
class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void printDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.printDetails();
    }
}
