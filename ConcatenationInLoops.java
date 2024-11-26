package hust.soict.globalict.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        // Số lần lặp để nối chuỗi
        int iterations = 100000;

        // Thử nghiệm sử dụng toán tử "+"
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thời gian sử dụng toán tử +: " + (endTime - startTime) + "ms");

        // Thử nghiệm sử dụng StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian sử dụng StringBuilder: " + (endTime - startTime) + "ms");

        // Thử nghiệm sử dụng StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian sử dụng StringBuffer: " + (endTime - startTime) + "ms");
    }
}
