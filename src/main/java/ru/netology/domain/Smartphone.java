package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    //конструкторы


    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public Smartphone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    //get/set

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
