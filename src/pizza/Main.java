package pizza;

public class Main {

    public static void main(String[] args) {
//        this.dough = dough;
//        this.cheese = cheese;
//        this.toppings = toppings;
//        this.type = type;
//        this.hasSauce = hasSauce;
//        this.isCustomized = isCustomized;
//        this.size = size;
//        this.price = price;
        PizzaPie fahimsPizza = new PizzaPie();
        System.out.println(fahimsPizza.cheese);

        PizzaPie yourPizza = new PizzaPie("Flour",
                "Cheddar", "Veggies", "Flat");
        System.out.println(yourPizza.toppings);
        System.out.println(yourPizza.price);

        PizzaPie theirPizza = new PizzaPie("Flour", "Mozz", "Mushrooms",
                "Regular", true, false, 'L', 11.99);
    }
}
