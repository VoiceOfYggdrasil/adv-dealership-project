package com.pluralsight;

public abstract class Contract {
    protected String date;
    protected String customerName;
    protected String customerEmail;
    protected String vehicleSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public String getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
