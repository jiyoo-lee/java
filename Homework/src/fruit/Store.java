package jiyoo.fruit;

import java.util.ArrayList;
import java.util.List;

public abstract class Store {
    List<Product> productList;

    public Store(String[] productInfos) {
        productList = new ArrayList<>();

        for (String productInfo : productInfos) {
            String[] productArray = productInfo.split("=");
            String productName = productArray[0];
            int productPrice = Integer.parseInt(productArray[1]);

            Product product = new Product(productName, productPrice);
            productList.add(product);
        }
    }

    public abstract int calculate(int productNumber, int count);

}
