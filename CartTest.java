public class CartTest {
    public static void main(String[] args) {
        // Create DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle Book", "Animation", "John Doe", 90, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", "Jane Doe", 85, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Joe Smith", 120, 29.99f);

        // Create a Cart
        Cart cart = new Cart();
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Display the cart
        cart.displayCart();

        // Search by ID
        cart.searchById(1);  // Search DVD with ID 1

        // Search by title
        cart.searchByTitle("Cinderella");  // Search DVD with title "Cinderella"
    }
}
