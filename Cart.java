public class Cart {
    private DigitalVideoDisc[] itemsOrdered; // Mảng lưu trữ danh sách DVD
    private int qtyOrdered; // Số lượng DVD trong giỏ hàng

    // Constructor khởi tạo
    public Cart() {
        itemsOrdered = new DigitalVideoDisc[20]; // Giả sử giỏ hàng tối đa 20 DVD
        qtyOrdered = 0; // Khởi tạo số lượng DVD là 0
    }

    // Phương thức thêm DVD vào giỏ hàng (1 DVD)
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < itemsOrdered.length) {
            itemsOrdered[qtyOrdered] = disc; // Thêm DVD vào mảng
            qtyOrdered++; // Tăng số lượng DVD
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Phương thức thêm danh sách DVD vào giỏ hàng (1 mảng DVD)
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd); // Gọi lại phương thức thêm 1 DVD vào giỏ hàng
        }
        System.out.println("The list of DVDs has been added.");
    }

    // Phương thức thêm một số lượng DVD tùy ý (varargs)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            addDigitalVideoDisc(dvd); // Gọi lại phương thức thêm 1 DVD vào giỏ hàng
        }
        System.out.println("The DVDs have been added.");
    }

    // Phương thức thêm hai DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1); // Thêm DVD đầu tiên
        addDigitalVideoDisc(dvd2); // Thêm DVD thứ hai
        System.out.println("Two DVDs have been added.");
    }

    // Phương thức xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) { // Kiểm tra DVD có trong giỏ hàng
                // Di chuyển các DVD còn lại
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Xóa DVD cuối cùng
                qtyOrdered--; // Giảm số lượng DVD
                System.out.println("The disc has been removed.");
                return; // Thoát khỏi phương thức
            }
        }
        System.out.println("The disc is not found in the cart.");
    }

    // Phương thức tính tổng giá trị giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); // Tính tổng giá của tất cả các DVD
        }
        return total;
    }

    // Phương thức hiển thị thông tin giỏ hàng (tuỳ chọn)
    public void displayCart() {
        System.out.println("Items in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + itemsOrdered[i].getTitle());
        }
    }
}
