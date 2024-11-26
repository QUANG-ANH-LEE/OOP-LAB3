public class Aims {
    public static void main(String[] args) {
        // Tạo giỏ hàng
        Cart cart = new Cart();
    
        // Tạo các DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 121, 24.95f);
            
        // Thêm DVD vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
    
        // Hiển thị giỏ hàng
        cart.displayCart();
    
        // Tính tổng giá trị giỏ hàng
        System.out.println("Total cost: " + cart.totalCost());
    
        // Xóa DVD khỏi giỏ hàng
        System.out.println("Removing 'The Lion King' from the cart...");
        cart.removeDigitalVideoDisc(dvd1); // Gọi phương thức xóa
        cart.displayCart(); // Hiển thị giỏ hàng sau khi xóa
    
        // Tính tổng giá trị giỏ hàng sau khi xóa
        System.out.println("Total cost after removal: " + cart.totalCost());
        
    }
    
}
