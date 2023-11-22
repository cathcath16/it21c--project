
import java.time.LocalDate;

public class Main {

public static void main(String[] args) {

Employee employee1 = new Employee("Catherene Labisia", 1000000, LocalDate.parse("20011-09-20"));

Employee employee2 = new Employee("Jona Aparicio", 80000, LocalDate.parse("2022-01-28")); 

Employee employee3 = new Employee("Katelalane Obispo" , 50000,  LocalDate.parse("2019-2-26"));

employee1.printEmployeeDetails();
employee2.printEmployeeDetails();
employee3.printEmployeeDetails();









     }
}