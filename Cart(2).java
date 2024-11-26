public class Cart {
    private DigitalVideoDisc[] itemsOrdered; // Mảng lưu trữ danh sách DVD
    private int qtyOrdered; // Số lượng DVD trong giỏ hàng

    // Constructor khởi tạo
    public Cart() {
        itemsOrdered = new DigitalVideoDisc[20]; // Giả sử giỏ hàng tối đa 20 DVD
        qtyOrdered = 0; // Khởi tạo số lượng DVD là 0
    }

    // Phương thức thêm DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < itemsOrdered.length) {
            itemsOrdered[qtyOrdered] = disc; // Thêm DVD vào mảng
            qtyOrdered++; // Tăng số lượng DVD
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Phương thức in ra các mục trong giỏ hàng và tổng chi phí
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        
        // In thông tin các DVD trong giỏ hàng
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.printf("%d. DVD - %s - %s - %s - %d minutes: %.2f $
", 
                               i + 1, disc.getTitle(), disc.getCategory(), disc.getDirector(), 
                               disc.getLength(), disc.getCost());
            totalCost += disc.getCost(); // Cộng dồn giá trị của DVD vào tổng
        }
        
        // In tổng chi phí
        System.out.printf("Total cost: %.2f $
", totalCost);
        System.out.println("*****************************************************");
    }

    // Phương thức tìm DVD trong giỏ hàng theo ID
    public DigitalVideoDisc searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                return itemsOrdered[i];
            }
        }
        return null; // Trả về null nếu không tìm thấy DVD
    }

    // Phương thức tìm DVD trong giỏ hàng theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found: " + itemsOrdered[i].getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with the title: " + title);
        }
    }
}
