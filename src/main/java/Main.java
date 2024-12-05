public class Main {
    public static void main(String[] args) {
        Product product = new Product("Ручной эспандер", 2500, 0.3);
        Order firstOrder = new Order();
        firstOrder.addProductWithDiscount(product);
        Order secondOrder = new Order();
        secondOrder.addProduct(product);
    }
}