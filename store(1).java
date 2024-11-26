package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;  // Array to store DVDs
    private int numberOfDVDs;  // Tracks the current number of DVDs in store

    // Constructor to initialize the store with a predefined size
    public Store(int size) {
        itemsInStore = new DigitalVideoDisc[size];
        numberOfDVDs = 0;
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (numberOfDVDs < itemsInStore.length) {
            itemsInStore[numberOfDVDs] = dvd;
            numberOfDVDs++;
            System.out.println("The DVD " + dvd.getTitle() + " has been added to the store.");
        } else {
            System.out.println("Store is full! Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store by ID
    public void removeDVD(int id) {
        for (int i = 0; i < numberOfDVDs; i++) {
            if (itemsInStore[i].getId() == id) {
                // Shift DVDs to fill the gap
                for (int j = i; j < numberOfDVDs - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numberOfDVDs - 1] = null;  // Set last DVD to null
                numberOfDVDs--;  // Decrease the count of DVDs
                System.out.println("The DVD with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("DVD with ID " + id + " not found in store.");
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("***********************STORE***********************");
        if (numberOfDVDs == 0) {
            System.out.println("No DVDs available in the store.");
        } else {
            for (int i = 0; i < numberOfDVDs; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].getTitle() + " - " + itemsInStore[i].getCategory());
            }
        }
        System.out.println("*****************************************************");
    }
}
