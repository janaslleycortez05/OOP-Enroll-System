package Interfaces;

import Entities.Section;
import Entities.Student;
import Entities.TuitionFeePayment;

public interface ITuitionService {

   double calculateFee(Student student, Section section);

    void makePayment(TuitionFeePayment payment, double amount);

    double getRemainingBalance(TuitionFeePayment payment);
}