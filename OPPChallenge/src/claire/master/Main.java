package claire.master;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
    }
}
