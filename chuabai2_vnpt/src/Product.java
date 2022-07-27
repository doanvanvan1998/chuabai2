import java.util.LinkedList;

public class Product {
    private int id;
    private String name;
    private int price;
    private String size;
    private String type;

    public Product() {
    }

    public Product(int id, String name, int price, String size, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Product inputData(Product product){
        return new Product(product.getId(),product.getName(), product.getPrice(), product.size, product.getType()) ;
    }
    public Product getMaxPrice (LinkedList<Product> list){
        Product productMax = list.get(0);
        for (Product item: list
             ) {
            if (item.getPrice() > productMax.getPrice()){
                productMax = item;
            }
        }
      return   productMax;
    }



}
