package com.usk.entity;

public class Order {

    public  String id;
    public Double amount;
    public  String status;

    public Order(String id, String status, Double amount) {
        this.id = id;
        this.status = status;
        this.amount = amount;
    }

    public Order() {

    }
}
