package Interfaces;

import Entities.Student;
import Entities.TuitionFeePayment;

public interface ITuitionService {

    double calculateFee(Student student);

    void makePayment(TuitionFeePayment payment, double amount);

    double getRemainingBalance(TuitionFeePayment payment);
}