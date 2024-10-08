package ocp.solucao;

public class Employee {
    private String name;
    private double salary;
    private PaymentStrategy paymentStrategy;

    public Employee(String name, double salary, PaymentStrategy paymentStrategy) {
        this.name = name;
        this.salary = salary;
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        double payment = paymentStrategy.calculatePayment(salary);
        System.out.println("Employee: " + name + " - Payment: " + payment);
    }
}
