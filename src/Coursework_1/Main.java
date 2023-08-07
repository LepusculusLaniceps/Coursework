package Coursework_1;

public class Main {
    private static final Employee[] employees = {
            new Employee("Фет Афанасий Афанасьевич", 55000, Department.DEPARTMENT_5),
            new Employee("Достоевский Федор Михайлович", 40000, Department.DEPARTMENT_1),
            new Employee("Гауди Антонио Пласид Гильем", 35000, Department.DEPARTMENT_2),
            new Employee("Ким Ки Дук", 63000, Department.DEPARTMENT_4),
            new Employee("Бродский Иосиф Александрович", 30000, Department.DEPARTMENT_5),
            new Employee("Айвазовский Иван Константинович", 70000, Department.DEPARTMENT_2),
            new Employee("Толкиен Джон Роналд Руэл", 80000, Department.DEPARTMENT_1),
            new Employee("Брэдбери Рэй Дуглас", 80000, Department.DEPARTMENT_2),
            new Employee("Кюри Мария Саломея", 85000, Department.DEPARTMENT_3),
            new Employee("Кодзи Эндрю Джулиан Хироаки", 60000, Department.DEPARTMENT_4)};



    public static void main(String[] args) {

        printEmployees();
        System.out.println();
        System.out.println("Сумма зарплат: " + calculateTotalSalary());
        System.out.println();
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println();
        System.out.println("Минимальная зарплата у сотрудника: " + findMinSalary());
        System.out.println();
        System.out.println("Максимальная зарплата у сотрудника: " + findMaxSalary());
        System.out.println();
        printFIO();


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public static Employee findMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee findMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }

    }
}