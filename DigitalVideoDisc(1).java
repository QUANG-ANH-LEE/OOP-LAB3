public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0; // Class variable to keep track of DVD count
    private int id; // Instance variable for unique DVD ID
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Increment the global DVD count and assign to the DVD
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Method to check if a DVD matches a title
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title); // Case-insensitive comparison
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " minutes: " + cost + " $";
    }
}
