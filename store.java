public class Store {
    private DigitalVideoDisc[] itemsInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[50];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = dvd;
                System.out.println("DVD added to store.");
                return;
            }
        }
        System.out.println("Store is full, cannot add DVD.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < itemsInStore.length; i++) {
            if (itemsInStore[i] == dvd) {
                itemsInStore[i] = null;
                System.out.println("DVD removed from store.");
                return;
            }
        }
        System.out.println("DVD not found in store.");
    }
}
