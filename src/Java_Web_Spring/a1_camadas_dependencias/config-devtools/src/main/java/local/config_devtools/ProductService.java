package local.config_devtools;

import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@RestController
@Service
//Negócio
public class ProductService {
  private ProductRepository productRepository;

  @Autowired
  public ProductService (ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public String getMessage() {
    return productRepository.getMessage();
  }

  public String getList() {
    return productRepository.getList();
  }

  public String getDataBase() {
    return productRepository.getDataBase();
  }
}

//  @RequestMapping("/ola")
//  @GetMapping
//  public String dizOla() {
//    return "Olá, mundo!!!!";
//  }

//  @RequestMapping("/adeus")
//  public String dizAdeus() {
//    return "Adeus mundo!!!!";
//  }
