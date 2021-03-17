/**
 * Employee
 */


public class Employee {

    String name;
    String address;
    double timeCard;

    // Método construtor
    public Employee() {
        
    }

    public Employee(String name, String address, double timeCard) {
        this.name = name;
        this.address = address;
        this.timeCard = timeCard;
    }

    public Employee(String name) {
        this.name = name;
        this.address = "Recife";
        this.timeCard = 10;
    }


    public String printEmployeeInfo() {
        return  "Name: " + this.name + 
                "\nAdress: " + this.address + 
                "\nTime Card: " + this.timeCard;
    }

    // this = employee1
    // employee = employee2
    public String printEmployeeInfo(Employee employee) {
        return  "Name: " + this.name + 
                "\nAdress: " + this.address + 
                "\nTime Card: " + this.timeCard +
                "\n ----------------------------------" +
                "\nName: " + employee.name + 
                "\nAdress: " + employee.address + 
                "\nTime Card: " + employee.timeCard;

    }
}