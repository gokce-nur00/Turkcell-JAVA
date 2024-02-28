package gun2odev2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product p = new Product(1, "Laptop", "Asus", 20000, 3, "Gri");

        ProductManager pm = new ProductManager();
        pm.add(p);

        System.out.println(p.getName() + p.getDescription());
        System.out.println(p.getKod());
    }
}
