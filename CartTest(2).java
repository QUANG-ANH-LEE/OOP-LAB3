package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create new Cart and DVDs
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Action", "George Lucas", 121, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "Lana Wachowski", 136, 29.95f);
        
        // Add DVDs to cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        
        // Display cart content
        cart.displayCart();
        
        // Search by ID
        System.out.println("Searching by ID 2:");
        cart.searchByID(2);
        
        // Search by Title
        System.out.println("Searching by Title 'The Matrix':");
        cart.searchByTitle("The Matrix");
    }
}
