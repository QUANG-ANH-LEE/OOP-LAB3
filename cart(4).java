package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsOrdered.add(dvd);
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i));
        }
        float totalCost = calculateTotalCost();
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("*****************************************************");
    }

    public float calculateTotalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            totalCost += dvd.getCost();
        }
        return totalCost;
    }

    public DigitalVideoDisc searchById(int id) {
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                return dvd;
            }
        }
        return null;
    }

    public ArrayList<DigitalVideoDisc> searchByTitle(String title) {
        ArrayList<DigitalVideoDisc> result = new ArrayList<>();
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.isMatch(title)) {
                result.add(dvd);
            }
        }
        return result;
    }

    // Getters and setters
    // ...
}
