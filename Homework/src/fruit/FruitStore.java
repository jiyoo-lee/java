package jiyoo.fruit;

public class FruitStore extends Store{

    public FruitStore(String[] productInfos) {
        super(productInfos);
    }

    @Override
    public int calculate(int productNumber, int count) {
        int receipt = productList.get(productNumber).getPrice() * count;
        return receipt;
    }
}
