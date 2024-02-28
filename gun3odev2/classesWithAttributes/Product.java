public class Product {
    // attribute
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int stockAmount;
    private String renk;
    private String kod;

    public Product(int id, String name, String description, double price, int stockAmount, String renk) {
        _id = id;
        _name = name;
        _description = description;
        _price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    public Product() {
        System.out.println("welcome to new product!");
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getKod() {
        return _name.substring(0, 1) + _id;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
