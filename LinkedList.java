import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {

        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {

            return Double.compare(this.salary, other.salary);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class linkedList{
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Ram", "Manager", 70000));
        employees.add(new Employee(2, "Sita", "Developer", 75000));
        employees.add(new Employee(3, "Lakshmi", "Tester", 55000));
        employees.add(new Employee(4, "Kavya", "Designer", 65000));

        // Sort the employees based on name and salary
        Collections.sort(employees);

        // Print the sorted list
        System.out.println("Sorted Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}