package main.trashed;

public class DeliveryDetailsPrinter {
    private Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sort) {
        this.sorter = sort;
    }
    public void printDetails(){
        sorter.sortDetails();
    }
}
