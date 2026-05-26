package service;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService(){
        this.employees = new ArrayList<>();
        this.employees.add(new Employee(1, "John Doe", 5000.0, "IT", "123 Main St", 5));
        this.employees.add(new Employee(2, "Jane Smith", 6000.0, "HR", "456 Elm St", 3));
        this.employees.add(new Employee(3, "Mike Johnson", 5500.0, "Marketing", "789 Oak St", 7));
        this.employees.add(new Employee(4, "Sara Davis", 6200.0, "Finance", "321 Pine St", 4));
        this.employees.add(new Employee(5, "Tom Wilson", 5800.00, "Sales", "654 Birch St", 6));
        this.employees.add(new Employee(6, "Jake Reacher", 8484.0, "Army", "No House", 20 ));
        this.employees.add(new Employee(6, "Jake Reacher", 8484.0, "Army", "No House", 20 ));
        this.employees.add(new Employee(6, "Jake Reacher", 8484.0, "Army", "No House", 20 ));

    }
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
