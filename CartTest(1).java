public class CartTest {
    public static void main(String[] args) {
        // Tạo một số DVD mẫu
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f);

        // Tạo giỏ hàng và thêm DVD vào
        Cart cart = new Cart();
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // In ra các mục trong giỏ hàng
        cart.printCart();
    }
}
