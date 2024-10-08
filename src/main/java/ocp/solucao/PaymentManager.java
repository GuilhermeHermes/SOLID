package ocp.solucao;

public class PaymentManager extends PaymentStrategy {

    @Override
    double calculatePayment(double amount) {
        System.out.println("Payment amount: " + amount * 1.3);
        return amount * 1.3;
    }
}
