public class Cart {
    private DigitalVideoDisc[] itemsOrdered; // Mảng lưu trữ danh sách DVD
    private int qtyOrdered; // Số lượng DVD trong giỏ hàng

    // Constructor khởi tạo
    public Cart() {
        itemsOrdered = new DigitalVideoDisc[20]; // Giả sử giỏ hàng tối đa 20 DVD
        qtyOrdered = 0; // Khởi tạo số lượng DVD là 0
    }

    // Thêm một DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < itemsOrdered.length) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    // Thêm một danh sách DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    // Thêm số lượng DVD tùy ý (varargs)
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            addDigitalVideoDisc(dvd);
        }
    }

    // Thêm hai DVD vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Xóa một DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc is not found in the cart.");
    }

    // Tính tổng giá trị giỏ hàng
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Hiển thị thông tin giỏ hàng
    public void displayCart() {
        System.out.println("Items in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("- " + itemsOrdered[i].getTitle() + " ($" + itemsOrdered[i].getCost() + ")");
        }
        System.out.println("Total cost: $" + totalCost());
    }
}
