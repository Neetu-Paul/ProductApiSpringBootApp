package io.samplespringboot.starterproject.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @RequestMapping("/products/{productId}")
    public Product getProductById(@PathVariable("productId") String productId) {
        return productService.getProductById(productId);
    }

    @RequestMapping(method= RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/products/{productId}")
    public void updateProduct(@RequestBody Product product, @PathVariable("productId") String productId) {
        productService.updateProduct(product, productId);
    }

    @RequestMapping(method= RequestMethod.DELETE, value = "/products/{productId}")
    public void deleteProduct(@PathVariable("productId") String productId) {
        productService.deleteProduct(productId);
    }

}
