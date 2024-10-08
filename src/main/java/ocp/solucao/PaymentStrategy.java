package ocp.solucao;

public abstract class PaymentStrategy {

    double calculatePayment(double amount) {
        System.out.println("Payment amount: " + amount);
        return amount;
    }


}
