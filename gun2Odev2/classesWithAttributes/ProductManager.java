package gun2odev2.classesWithAttributes;

public class ProductManager {
    public void add(Product product) {
        System.out.println("Urun eklendi:" + product.getName());
    }

    public void add2(int id, String name, String description, int stockAmount, double price) {
        // not efficient
    }
}
