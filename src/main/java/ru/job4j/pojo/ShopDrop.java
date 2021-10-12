package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (index = 0; index < products.length - 1; index++) {
               if (products[index] == null) {
                for (int i = index; i < products.length - 1; i++) {
                    if (products[i + 1] != null) {
                        products[index] = products[i + 1];
                        products[i + 1] = null;
                        break;
                    }
                }
            }
        }
        return products;
    }
}
