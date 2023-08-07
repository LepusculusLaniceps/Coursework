package Coursework_1;

import java.util.Objects;

public class Employee {
    private final Integer id;
    private EmployeesNames employeesNames;
    private Integer salary;
    private Integer departmentId;


    private static Integer idCounter = 1;

    public Employee(EmployeesNames employeesNames, Integer salary, Integer departmentId) {
        this.id = idCounter++;
        this.employeesNames = employeesNames;
        this.salary = salary;
        this.departmentId = departmentId;

    }

    public Integer getId() {
        return id;
    }

    public EmployeesNames getEmployeesNames() {
        return employeesNames;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(employeesNames, employee.employeesNames) && Objects.equals(salary, employee.salary) && Objects.equals(departmentId, employee.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeesNames, salary, departmentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeesNames=" + employeesNames +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }
}

