package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        // Create store with space for 5 DVDs
        Store store = new Store(5);

        // Create sample DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 15.99f);

        // Add DVDs to store
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Display DVDs in store
        store.displayStore();

        // Remove a DVD by ID
        store.removeDVD(1);

        // Display DVDs after removal
        store.displayStore();
    }
}
