package Services;

import Interfaces.ITuitionService;
import Entities.Student;
import Entities.Section;
import Entities.Course;
import Entities.TuitionFeePayment;

public class TuitionServiceImpl implements ITuitionService {

    private static final double RATE_PER_UNIT = 1500;

    @Override
    public double calculateFee(Student student, Section section) {

        int totalUnits = 0;

        for (Course c : section.getCourses()) {
            totalUnits += c.getUnits();
        }

        return totalUnits * RATE_PER_UNIT;
    }

    @Override
    public void makePayment(TuitionFeePayment payment, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid payment amount");
        }

        if (payment.getAmountPaid() + amount > payment.getTotalFee()) {
            throw new IllegalArgumentException("Payment exceeds total fee");
        }

        payment.setAmountPaid(payment.getAmountPaid() + amount);
    }

    @Override
    public double getRemainingBalance(TuitionFeePayment payment) {
        return payment.getRemainingBalance();
    }
}