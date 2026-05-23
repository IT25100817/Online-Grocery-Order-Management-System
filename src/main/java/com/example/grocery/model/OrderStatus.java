package com.example.grocery.model;

// Abstraction: this enum hides the details of order states behind simple names
// Other classes just use OrderStatus.PENDING instead of dealing with raw strings
public enum OrderStatus {
    PENDING,
    CONFIRMED,
    DELIVERED,
    CANCELLED;

    // Returns a readable label for each status to show in the UI
    // Abstraction: callers don't need to know how the label is built
    public String getLabel() {
        switch (this) {
            case PENDING:   return "Pending";
            case CONFIRMED: return "Confirmed";
            case DELIVERED: return "Delivered";
            case CANCELLED: return "Cancelled";
            default:        return this.name();
        }
    }
}
