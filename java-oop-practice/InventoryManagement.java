/*
13️⃣ Inventory Management System

🧩 Concept: Collections + OOP
⚙️ Classes:

Product (id, name, price, quantity)

Inventory (addProduct, removeProduct, displayAll)
💡 Hint: Use ArrayList<Product> to manage items dynamically.

*/

import java.util.ArrayList;

class Product {
    String Id;
    String name;
    long price;
    int quantity;

    Product(String Id, String name, long price, int quantity) {
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Inventory {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {

        int found = 0;

        for (Product product : products) {
            if (product.Id.equals(p.Id)) {
                product.quantity += p.quantity;
                found = 1;
                break;
            }
        }

        if (found == 0) {
            products.add(p);
        }
    }

    void removeProduct(String Id) {
        products.removeIf(product -> product.Id.equals(Id));
    }

    void displayAll() {
        System.out.println("All Products in Inventory : ");

        for (Product product : products)
            System.out.println(product.Id + "\t" + product.name + "\t" + product.price + "\t" + product.quantity);
    }

}

public class InventoryManagement {
    public static void main(String[] args) {
        Inventory I = new Inventory();

        I.addProduct(new Product(new String("Prd01"), "Mobile", 450000, 20));
        I.displayAll();

        I.addProduct(new Product("Prd02", "Laptop", 70000, 25));
        I.addProduct(new Product("Prd02", "Laptop", 65000, 15));

        I.displayAll();
        I.removeProduct("Prd01");

        I.displayAll();
    }
}
