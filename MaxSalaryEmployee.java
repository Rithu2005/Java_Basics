import java.util.*;

class MyEmployee {
    String name;
    double salary;

    public MyEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class MaxSalaryEmployee {
    public static void main(String[] args) {
        List<MyEmployee> employees = Arrays.asList(
                new MyEmployee("John", 55000),
                new MyEmployee("Priya", 72000),
                new MyEmployee("Anil", 66000)
        );

        // Find employee with max salary
        MyEmployee maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(MyEmployee::getSalary))
                .orElse(null);

        System.out.println(maxSalaryEmployee);
    }
}
