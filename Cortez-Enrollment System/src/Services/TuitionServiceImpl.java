package Services;

import Interfaces.ITuitionService;
import Entities.Student;
import Entities.TuitionFeePayment;

public class TuitionServiceImpl implements ITuitionService {

    private static final double RATE_PER_UNIT = 1000.0;

    @Override
    public double calculateFee(Student student) {
        // Simplified fixed fee (you can improve later)
        return 5000.0;
    }

    @Override
    public void makePayment(TuitionFeePayment payment, double amount) {
        payment.setAmountPaid(payment.getAmountPaid() + amount);
    }

    @Override
    public double getRemainingBalance(TuitionFeePayment payment) {
        return payment.getTotalFee() - payment.getAmountPaid();
    }
}