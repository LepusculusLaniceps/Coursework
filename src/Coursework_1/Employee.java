package Coursework_1;

import java.util.Objects;

public class Employee {
    private final int id;
    private String fio;
    private int salary;
    private Department department;
    private static int idCounter = 1;
    public Employee(String fio, int salary, Department department) {
        this.id = idCounter++;
        this.fio = fio;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(fio, employee.fio) && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, salary, department);
    }
}

