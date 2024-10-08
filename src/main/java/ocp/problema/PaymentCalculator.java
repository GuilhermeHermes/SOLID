package ocp.problema;

public class PaymentCalculator {
    
        public double calculatePayment(Double salary, String cargo ) {
            if (cargo.equals("dev")) {
                System.out.println("Payment amount: " + salary * 1.1);
                return salary * 1.1;
            } else if (cargo.equals("manager")) {
                System.out.println("Payment amount: " + salary * 1.3);
                return salary * 1.3;
            }
            return 0;
        }
}
