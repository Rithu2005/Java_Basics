import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;
    double salary;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }
}

public class GroupEmployeesByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 55000),
                new Employee("Priya", "HR", 60000),
                new Employee("Anil", "IT", 66000),
                new Employee("Meena", "HR", 59000),
                new Employee("Karthik", "Finance", 70000)
        );

        Map<String, List<String>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println(groupedByDept);
    }
}


