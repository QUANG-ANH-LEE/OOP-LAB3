package hust.soict.globalict.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            buffer.append("garbage");  // Sử dụng StringBuffer để tránh tạo ra đối tượng chuỗi không cần thiết
        }
        System.out.println("Không có rác được tạo ra khi sử dụng StringBuffer!");
    }
}
