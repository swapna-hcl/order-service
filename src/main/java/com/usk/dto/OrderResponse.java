package com.usk.dto;

public class OrderResponse {
    private String id;
    private Double amount;
    private String status;

    public OrderResponse() {
    }

    public OrderResponse(String id, String status, Double amount) {
        this.id = id;
        this.status = status;
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
