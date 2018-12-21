package springapp.domain;

public class Product {
    private int id;
    private String description;
    private Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public String toString(){
        StringBuffer buffer =new StringBuffer();
        buffer.append("ID:"+id+";");
        buffer.append("Description:"+description+";");
        buffer.append("Price:"+price+":");
        return buffer.toString();
    }
}