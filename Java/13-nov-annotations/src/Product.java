public class Product {

    private int id;
    private String name;
    private String category;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    @OldModel
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @OldModel(name="Price is compulsory")
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product { " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                " }";
    }
}
