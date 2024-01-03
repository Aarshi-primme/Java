class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private int age;

    // Method to initialize employee details
    public void initialize(int empId, String empName, double empSalary, int empAge) {
        employeeId = empId;
        employeeName = empName;
        salary = empSalary;
        age = empAge;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: $" + salary);
        System.out.println("Age: " + age + " years");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee E1 = new Employee();
        Employee E2 = new Employee();

        // Initialize employee details
        E1.initialize(101, "John Doe", 50000.0, 28);
        E2.initialize(102, "Jane Smith", 60000.0, 32);

        // Display employee details
        System.out.println("Employee 1 Details:");
        E1.display();

        System.out.println("\nEmployee 2 Details:");
        E2.display();
    }
}
