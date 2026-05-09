package Entities;

public class TuitionFeePayment {
    private Student student;
    private double totalFee;
    private double amountPaid;

    public TuitionFeePayment(Student student, double totalFee) {
        this.student = student;
        this.totalFee = totalFee;
        this.amountPaid = 0;
    }

    public Student getStudent() { return student; }

    public double getTotalFee() { return totalFee; }
    public void setTotalFee(double totalFee) { this.totalFee = totalFee; }

    public double getAmountPaid() { return amountPaid; }
    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }

    public double getRemainingBalance() {
        return totalFee - amountPaid;
    }
}