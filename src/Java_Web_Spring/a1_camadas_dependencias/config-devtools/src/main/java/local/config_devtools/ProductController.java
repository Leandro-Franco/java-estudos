package local.config_devtools;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//avisa pro spring gerenciar
@RestController
//Interação
public class ProductController {

    private ProductService productService;

    //avisa pro spring injetar a dependencia a partir do construtor
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

//    @GetMapping
    @RequestMapping("/product")
    public  String getMessage() {
        return productService.getMessage();
    }

    @RequestMapping("/list")
    public String getList() {
        return productService.getList();
    }

    @RequestMapping("/getDatabase")
    public String getDatabase() {
        return productService.getDataBase();
    }
}
