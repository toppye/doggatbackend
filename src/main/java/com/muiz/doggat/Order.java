package com.muiz.doggat;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @JsonProperty("c_name")
    private String name;
    @JsonProperty("p")
    private int price;
    @JsonProperty("q")
    private int quantity;

    @Override
    public String toString() {
        return "Order [" +
                "name=" + name + "," +
                "price=" + price + "," +
                "quantity=" + quantity +
                "]";
    }
}
