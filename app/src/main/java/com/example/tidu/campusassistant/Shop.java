package com.example.tidu.campusassistant;

public class Shop {
    String name;
    String address;
    String image;
    String phn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public Shop(String name, String address, String image, String phn) {
        this.name = name;
        this.address = address;
        this.image = image;
        this.phn = phn;
    }
}
