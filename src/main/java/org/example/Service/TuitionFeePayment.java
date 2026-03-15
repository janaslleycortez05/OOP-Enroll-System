package org.example.Service;

public class TuitionFeePayment {

    private double balance;

    public double calculateTuitionFee(int units, double discountRate) {

        double pricePerUnit = 1000.00;
        double totalTuition = units * pricePerUnit;
        double discount = totalTuition * discountRate;

        totalTuition -= discount;
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