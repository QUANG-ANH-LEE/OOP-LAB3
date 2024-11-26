
public class DigitalVideoDisc {
    private String title;
    private float cost;

    // Constructor
    public DigitalVideoDisc(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }

    // Getter và Setter cho title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }
}

public class TestPassingParameter {

    // Phương thức swap để đổi giá trị của 2 đối tượng DigitalVideoDisc
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc temp = dvd1;
        dvd1 = dvd2;
        dvd2 = temp;
    }

    // Phương thức thay đổi title của DVD
    public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
        dvd.setTitle(newTitle);
    }

    public static void main(String[] args) {
        // Tạo 2 DVD
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle Book", 15.99f);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", 12.99f);

        // In ra tiêu đề ban đầu
        System.out.println("Before swap:");
        System.out.println("Jungle DVD: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD: " + cinderellaDVD.getTitle());

        // Thử phương thức swap (sẽ không thay đổi gì)
        swap(jungleDVD, cinderellaDVD);

        // In ra sau khi swap
        System.out.println("\nAfter swap:");
        System.out.println("Jungle DVD: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD: " + cinderellaDVD.getTitle());

        // Thử phương thức changeTitle
        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        // In ra sau khi thay đổi title
        System.out.println("\nAfter changeTitle:");
        System.out.println("Jungle DVD: " + jungleDVD.getTitle());
    }
}
