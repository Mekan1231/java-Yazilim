//PascalCase
public class Product {
    //özellik tutucudur.
    //burada nesne şablonu oluşturulur

    //buraya field yazılır ve camelCase yazılır.

    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitsInStock;
    //private= sadece o clasın içinde kullanılabilir denemek(bu classa özel)


    public String getName() {//okumak için
        return name;
    }

    public void setName(String name) {//yazmak için
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
