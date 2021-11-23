package io.samplespringboot.starterproject.product;

public class Product {

    private String productName;
    private String productId;
    private String productDescription;
    private String productCategory;
    private int productPrice;

    public Product() {
    }

    public Product(String productName, String productId, String productDescription, String productCategory, int productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String toString() {
        return "Product Name: "+productName + " | Product Id: " +productId+ " | Product Category: "+productCategory+
                " | Product Description: "+productDescription+" | Product Price: "+productPrice;
    }
}
