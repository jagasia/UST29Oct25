package com.example.customerorder.dto;

public class OrderRequest {
    private double totalAmount;

    public OrderRequest() {}

    public OrderRequest(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
