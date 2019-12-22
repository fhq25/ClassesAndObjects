package pizza;

public class PizzaPie {

    String dough;
    String cheese;
    String toppings;
    String type;
    boolean hasSauce;
    boolean isCustomized;
    char size;
    double price;

    public PizzaPie() {
        this.dough = "Standard";
        this.cheese = "Mozzarella";
        this.toppings = "Plain";
        this.type = "Regular";
        this.hasSauce = true;
        this.isCustomized = false;
        this.size = 'M';
        this.price = 8.99;

    }

    // create a constructor that takes in dough, cheese, toppings, type
    public PizzaPie(String dough, String cheese, String toppings, String type) {
        this.dough = dough;
        this.cheese = cheese;
        this.toppings = toppings;
        this.type = type;
    }

    // create a constructor that takes in all properties

    public PizzaPie(String dough, String cheese, String toppings, String type, boolean hasSauce, boolean isCustomized, char size, double price) {
        this.dough = dough;
        this.cheese = cheese;
        this.toppings = toppings;
        this.type = type;
        this.hasSauce = hasSauce;
        this.isCustomized = isCustomized;
        this.size = size;
        this.price = price;
    }

    public void bake() {
        System.out.println("Bake pizza");
    }

    public void consumed() {
        System.out.println("Pizza is consumed");
    }

    public void sliced() {
        System.out.println("Pizza is sliced");
    }
}