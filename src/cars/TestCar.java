package cars;

public class TestCar {

    public static void main(String[] args) {
        // Create a 2005 Honda Civic
        Car honda = new Car("Honda", "Civic", 2005);
        System.out.println("The brand of this car is " + honda.getBrand());
        System.out.println("The model of this car is " + honda.getModel());
        System.out.println("The year of this car is " + honda.getYear());

        // Create a used 2019 Nissan Altima that costs $12,000.79
        //String brand, String model, int year, double price, boolean isUsed
        Car altima = new Car("Nissan", "Altima", 2019,
                12000.79, true);
        System.out.println("----------------------------------------");
        System.out.println("The brand of this car is " + altima.getBrand());
        System.out.println("The model of this car is " + altima.getModel());
        System.out.println("The year of this car is " + altima.getYear());
        System.out.println("The price of this car is " + altima.getPrice());
        System.out.println("Is the car used? " + altima.isUsed());
        altima.setPrice(7000.40);
        System.out.println("----------- Incident: Scraped the car ----------");
        System.out.println("The brand of this car is " + altima.getBrand());
        System.out.println("The model of this car is " + altima.getModel());
        System.out.println("The year of this car is " + altima.getYear());
        System.out.println("The price of this car is " + altima.getPrice());
        System.out.println("Is the car used? " + altima.isUsed());

    }
}
