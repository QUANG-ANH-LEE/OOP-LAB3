package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Lana Wachowski", 136, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 15.99f);

        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.printCart();

        System.out.println("Searching for DVD with ID 1:");
        DigitalVideoDisc searchResult = cart.searchById(1);
        if (searchResult != null) {
            System.out.println("Found: " + searchResult);
        } else {
            System.out.println("No DVD found with that ID.");
        }

        System.out.println("Searching for DVDs with title 'Inception':");
        cart.searchByTitle("Inception").forEach(dvd -> System.out.println(dvd));
    }
}
