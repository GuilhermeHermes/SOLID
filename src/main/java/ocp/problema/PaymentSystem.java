package ocp.problema;

public class PaymentSystem {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1000, "manager");
        Employee employee2 = new Employee("Doe", 1000, "dev");
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        paymentCalculator.calculatePayment(employee1.salary, employee1.cargo);
        paymentCalculator.calculatePayment(employee2.salary, employee2.cargo);
        //toda vez que eu adicionar um novo cargo eu preciso alterar a classe PaymentCalculator
    }
}
