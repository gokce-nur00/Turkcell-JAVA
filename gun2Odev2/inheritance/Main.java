package gun2odev2.inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerManager cm = new CustomerManager();
        EmployeeManager em = new EmployeeManager();

        cm.Add();
        em.List();
    }
}
