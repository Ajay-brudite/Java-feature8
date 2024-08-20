package StreamOnEmployeeData;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private double salary;
    private LocalDate dateOfJoining;

    public Employee(int id, String name, int age, String gender, String department, double salary, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public LocalDate getDateOfJoining() { return dateOfJoining; }
}

public class EmployeeStreamOperations {

    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee(1, "John Doe", 25, "Male", "HR", 50000, LocalDate.of(2018, 5, 21)),
            new Employee(2, "Jane Smith", 30, "Female", "Finance", 75000, LocalDate.of(2016, 3, 15)),
            new Employee(3, "Robert Brown", 45, "Male", "IT", 100000, LocalDate.of(2010, 7, 1)),
            new Employee(4, "Emily Davis", 22, "Female", "HR", 60000, LocalDate.of(2020, 8, 10)),
            new Employee(5, "Michael Johnson", 35, "Male", "Finance", 120000, LocalDate.of(2012, 9, 25)),
            new Employee(6, "Sarah Wilson", 28, "Female", "IT", 90000, LocalDate.of(2015, 12, 5)),
            new Employee(7, "Chris Evans", 32, "Male", "IT", 110000, LocalDate.of(2009, 10, 20)),
            new Employee(8, "Anna Watson", 24, "Female", "Finance", 65000, LocalDate.of(2019, 1, 16))
        );
    }

    public static void main(String[] args) {

        // Count Male and Female Employees
        System.out.println("------How many male and female employees are there in the organization?--------\n");
        Map<String, Long> genderCount = getEmployees().stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
            System.out.println("Gender Count: " + genderCount);

        // Print the Names of All Departments
        System.out.println("\n----------Print the name of all departments in the organization.------------");
        System.out.println("Departments:");
        getEmployees().stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(System.out::println);

        // Average Age of Male and Female Employees
        System.out.println("\n-----------What is the average age of male and female employees?----------------");
        Map<String, Double> averageAgeByGender = getEmployees().stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
            System.out.println("Average Age by Gender: " + averageAgeByGender);

        // Highest and Second Highest Paid Employees
        System.out.println("\n----------------Get the details of highest paid, second highest paid employee in the organization.-------------");
        List<Employee> sortedEmployees = getEmployees().stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());
        System.out.println("Highest Paid: " + sortedEmployees.get(0).getName());
        System.out.println("Second Highest Paid: " + sortedEmployees.get(1).getName());

        // Employees Who Joined After 2015
        System.out.println("\n----------------Get the names of all employees who have joined after 2015-------------------");
        List<String> employeesJoinedAfter2015 = getEmployees().stream()
            .filter(emp -> emp.getDateOfJoining().isAfter(LocalDate.of(2015, 12, 31)))
            .map(Employee::getName)
            .collect(Collectors.toList());
        System.out.println("Employees Joined After 2015: " + employeesJoinedAfter2015);

        // Count Employees in Each Department
        System.out.println("\n----------------Count the number of employees in each department-----------------");
        Map<String, Long> employeeCountByDept = getEmployees().stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
            System.out.println("Employee Count by Department: " + employeeCountByDept);

        // Average Salary of Each Department
        System.out.println("\n------------------What is the average salary of each department?---------------");
        Map<String, Double> averageSalaryByDept = getEmployees().stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
            System.out.println("Average Salary by Department: " + averageSalaryByDept);

        // Employee with the Most Working Experience
        System.out.println("\n-----------------Who has the most working experience in the organization?----------------");
        Optional<Employee> mostExperienced = getEmployees().stream()
            .min(Comparator.comparing(Employee::getDateOfJoining));
            mostExperienced.ifPresent(emp -> System.out.println("Most Experienced: " + emp.getName()));

        // Youngest Male Employee in Each Department
        System.out.println("\n----------------------Get the details of youngest male employee in the each department.----------------");
        Map<String, Optional<Employee>> youngestMaleByDept = getEmployees().stream()
            .filter(emp -> emp.getGender().equals("Male"))
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
        youngestMaleByDept.forEach((dept, emp) -> System.out.println(dept + ": " + emp.get().getName()));

        // Average and Total Salary of the Whole Organization
        System.out.println("\n-------------------What is the average salary and total salary of the whole organization?-------------------");
        DoubleSummaryStatistics salaryStats = getEmployees().stream()
            .mapToDouble(Employee::getSalary)
            .summaryStatistics();
        System.out.println("Average Salary: " + salaryStats.getAverage());
        System.out.println("Total Salary: " + salaryStats.getSum());
    }
}
