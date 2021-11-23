package io.samplespringboot.starterproject.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product("Cardamom","cardamom", "Cardamom First Quality",
                    "Spices", 500),
            new Product("Cloves", "cloves", "Cloves First Quality",
                    "Spices", 300),
            new Product("Nutmeg", "nutmeg", "Nutmeg First Quality",
                    "Spices", 700),
            new Product("Wheat Flour", "wheat", "Organic Whole Wheat Flour",
                    "Pantry", 300),
            new Product("Rice Flour", "rice", "Organic Rice Flour",
                    "Pantry", 250),
            new Product("Shirt", "shirt", "Kids Girls Shirt",
                    "Apparel", 250),
            new Product("Puzzle", "puzzle", "Kids Toys Puzzle",
                    "Toys", 650)
    ));

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(String id) {
        return productList.stream().
                filter(t -> t.getProductId().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void updateProduct(Product product, String productId){
        for (int i=0; i<productList.size(); i++) {
            Product p = productList.get(i);
            if(p.getProductId().equalsIgnoreCase(productId)) {
                productList.set(i, product);
                return;
            }
        };
    }

    public void deleteProduct(String productId) {
        productList.removeIf(t -> t.getProductId().equals(productId));
    }

}
