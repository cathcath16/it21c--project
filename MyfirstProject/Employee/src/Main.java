
import java.time.LocalDate;

public class Main {

public static void main(String[] args) {

Employee employee1 = new Employee("Jaysash Gundaya", 1000000, LocalDate.parse("2013-09-20"));

Employee employee2 = new Employee("Daniel padilla", 80000000, LocalDate.parse("2005-01-28")); 

Employee employee3 = new Employee("James reid" , 1000000,  LocalDate.parse("2019-2-26"));

employee1.printEmployeeDetails();
employee2.printEmployeeDetails();
employee3.printEmployeeDetails();









     }
}