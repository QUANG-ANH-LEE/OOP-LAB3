package hust.soict.globalict.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String garbage = "";
        for (int i = 0; i < 100000; i++) {
            garbage += "garbage";  // Nối chuỗi bằng toán tử "+", tạo ra rất nhiều đối tượng chuỗi không cần thiết
        }
        System.out.println("Đã tạo rác!");
    }
}
