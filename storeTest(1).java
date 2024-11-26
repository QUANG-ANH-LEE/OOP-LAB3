package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Matrix", "Action", "Lana Wachowski", 136, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 15.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Print all DVDs in store
        System.out.println("Items in store:");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
    }
}
