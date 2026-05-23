package com.example.grocery.dto;

import jakarta.validation.constraints.NotBlank;

public class OrderForm {
    @NotBlank(message = "Order type is required")
    private String orderType;
    @NotBlank(message = "Payment type is required")
    private String paymentType;
    private String paymentReference;

    // Abstraction: this method hides the validation logic
    // The controller just calls isValid() and does not need to know the checks inside
    public boolean isValid() {
        return orderType != null && !orderType.isBlank()
            && paymentType != null && !paymentType.isBlank();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }
}
