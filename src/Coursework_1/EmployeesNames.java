package Coursework_1;

public class EmployeesNames {

    private String surname;
    private String firstName;
    private String secondName;

    public EmployeesNames(String surname, String firstName, String secondName) {
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;


    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}

