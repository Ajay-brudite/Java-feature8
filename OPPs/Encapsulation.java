package OPPs;

// Employee class demonstrating encapsulation
class Employee {
    // Private fields
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Adding a simple validation
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}

// Main class containing the main method
public class Encapsulation {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 30, 60000);

        // Accessing employee details using getters
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());

        // Modifying salary using setter
        employee.setSalary(70000);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Attempt to set a negative salary
        employee.setSalary(-5000); // Should print an error message
    }
}
