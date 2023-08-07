package Coursework_1;

public class Main {
    private static final Employee[] employees = {
            new Employee()
            new Employee("Фет", "Афанасий", "Афанасьевич", 55000, 5),
            new Employee("Достоевский", "Федор", "Михайлович", 40000, 5),
            new Employee("Гауди", "Антонио", "ПласидГильем", 35000, 4),
            new Employee("Ким", "Ки", "Дук", 63000, 4),
            new Employee("Бродский", "Иосиф", "Александрович", 30000, 3),
            new Employee("Айвазовский", "Иван", "Константинович", 70000, 3),
            new Employee("Толкиен", "Джон", "РоналдРуэл", 80000, 2),
            new Employee("Брэдбери", "Рэй", "Дуглас", 80000, 2),
            new Employee("Кюри", "Мария", "Саломея", 85000, 1),
            new Employee("Кодзи", "Эндрю", "ДжулианХироаки", 60000, 1)};


    public static void main(String[] args) {
        EmployeesNames employeesNames1 = new EmployeesNames("Достоевский", "Федор", "Михайлович");
        EmployeesNames employeesNames2 = new EmployeesNames("Гауди", "Антонио", "ПласидГильем");
        EmployeesNames employeesNames3 = new EmployeesNames("Ким", "Ки", "Дук");
        EmployeesNames employeesNames4 = new EmployeesNames("Бродский", "Иосиф", "Александрович");
        EmployeesNames employeesNames5 = new EmployeesNames("Айвазовский", "Иван", "Константинович");
        EmployeesNames employeesNames6 = new EmployeesNames("Толкиен", "Джон", "РоналдРуэл");
        EmployeesNames employeesNames7 = new EmployeesNames("Фет", "Афанасий", "Афанасьевич");
        EmployeesNames employeesNames8 = new EmployeesNames("Брэдбери", "Рэй", "Дуглас");
        EmployeesNames employeesNames9 = new EmployeesNames("Кюри", "Мария", "Саломея");
        EmployeesNames employeesNames10 = new EmployeesNames("Кодзи", "Эндрю", "ДжулианХироаки");




        printEmployees();
        System.out.println();
        System.out.println("Сумма зарплат: " + calculateTotalSalary());
        System.out.println();
        System.out.println("Средняя зарплата: " + calculateAverageSalary());
        System.out.println();
        System.out.println("Минимальная зарплата: " + findEmployeeWithMinSalary());
        System.out.println();
        System.out.println("Максимальная зарплата: " + findEmployeeWithMaxSalary());
        System.out.println();
        System.out.println("Сотрудники: " + EmployeesNames());



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

    public static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }



    }
}