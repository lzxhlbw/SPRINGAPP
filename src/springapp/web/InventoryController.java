package springapp.web;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import springapp.domain.Product;
import springapp.service.ProductManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.util.Map;
import java.util.HashMap;

public class InventoryController implements Controller {
    protected final Log logger = LogFactory.getLog(getClass());
    private ProductManager productManager;
    public void setProductManager(ProductManager productManager){
        this.productManager=productManager;
    }
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws ServletException, IOException {
        String now = (new Date()).toString();
        logger.info(".....returning hello view with....." + now);
        Map<String,Object> mymodel=new HashMap<String, Object>();
        mymodel.put("now",now);
        mymodel.put("products",this.productManager.getProducts());
        return new ModelAndView("hello", "model",mymodel);

    }

}
