package ocp.solucao;

public class PaymentSystem {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 1000, new PaymentManager());
        Employee employee2 = new Employee("Doe", 1000, new PaymentDev());
        employee1.pay();
        employee2.pay();
    }

}
