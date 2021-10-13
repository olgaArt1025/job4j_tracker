package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (index = 0; index < products.length; index++) {
               if (products[index] == null) {
                for (int i = index + 1; i < products.length; i++) {
                    if (products[i] != null) {
                        products[index] = products[i];
                        products[i] = null;
                        break;
                    }
                }
            }
        }
        return products;
    }
}
