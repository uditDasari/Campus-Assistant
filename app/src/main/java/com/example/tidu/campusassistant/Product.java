package com.example.tidu.campusassistant;

public class Product {
    String name,desc;
    String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product(String name, String desc, String price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
}
