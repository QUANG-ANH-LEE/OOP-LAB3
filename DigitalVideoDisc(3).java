package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0; // To track number of DVDs
    private int id;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; // Unique ID
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public float getCost() {
        return cost;
    }
}
