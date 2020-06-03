package com.kodilla.good.patterns.food2door_13_4;

public class ClientOrder {
    private String retailer;
    private String productDescription;
    private int quantity;
    private int weight;


    public ClientOrder(String retailer, String productDescription, int quantity) {
        this.retailer = retailer;
        this.productDescription = productDescription;
        this.quantity = quantity;
    }

    public ClientOrder(String retailer, String productDescription, int quantity, int weight) {
        this.retailer = retailer;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getRetailer() {
        return retailer;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWeight() {
        return weight;
    }
}
