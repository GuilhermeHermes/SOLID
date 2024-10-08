package ocp.solucao;

public class PaymentDev extends PaymentStrategy {

    @Override
    double calculatePayment(double amount) {
        System.out.println("Payment amount: " + amount * 1.1);
        return amount * 1.1;
    }

}
