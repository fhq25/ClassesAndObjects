package cars;

public class Car {

    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isUsed;

    public Car(){}

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year, double price, boolean isUsed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isUsed = isUsed;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isUsed() {
        return this.isUsed;
    }

    public void setUsed(boolean used) {
        this.isUsed = used;
    }

    public void drive() {
        System.out.println("This car drives");
    }

    public void vroom() {
        System.out.println("Vroom");
    }
}
