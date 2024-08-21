package OPPs;

// Superclass: Employee
class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
// Subclass: Manager
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary); // Call to the superclass constructor
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Department: " + department);
    }
}
