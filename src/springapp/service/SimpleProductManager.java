package springapp.service;
import java.util.List;
import springapp.domain.Product;
import java.math.BigDecimal;
import javax.annotation.Resource;




public class SimpleProductManager implements ProductManager {
    private List<Product> products;
    public List<Product> getProducts(){
        return products;
    }

    public void increasePrice(int percentage){
        if(products!=null){
            for(Product product:products){
                double newPrice =Double.valueOf(product.getPrice()).doubleValue()
                        *(100+percentage)/100;
                product.setPrice(newPrice);
            }
        }
    }

    public void setProducts(List<Product> products){
        this.products=products;
    }
}
