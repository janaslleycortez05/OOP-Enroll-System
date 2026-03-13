package org.example.Service;

public class TuitionFeePayment {

    private double pricePerUnit = 1000.00;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate) {

        totalTuition = units * pricePerUnit;
        double discount = totalTuition * discountRate;

        totalTuition = totalTuition - discount;
        balance = totalTuition;

        return totalTuition;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public double getRemainingBalance() {
        return balance;
    }

    public boolean isFullyPaid() {
        return balance <= 0;
    }
}