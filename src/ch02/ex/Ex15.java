package ch02.ex;

import java.util.ArrayList;

public class Ex15 {

    public static void main(String[] args) {

        Invoice myInvoice = new Invoice();

        Invoice.Item newItem = new Invoice.Item(
                "BlackWell Toaster", 2, 19.95);

        myInvoice.addItem(newItem);

        System.out.println(myInvoice);
    }
}

class Invoice {

    public static class Item {

        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double getPrice() {

            return quantity * unitPrice;
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {

        Item item = new Item(description, quantity, unitPrice);
        items.add(item);
    }

    public void addItem(Item item) {

        items.add(item);
    }

    @Override
    public String toString() {

        String result = "";

        for (Item item : items) {

            result += "Description: " + item.description + "\n";
            result += "Quantity: " + item.quantity + "\n";
            result += "UnitPrice: " + item.unitPrice + "\n";
            result += "Price: " + item.getPrice() + "\n";
        }

        return result;
    }
}
