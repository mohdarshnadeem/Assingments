package Question5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> emp  = Arrays.asList(
                new Employee("Arsh Nadeem", 320000l, "Delhi"),
                new Employee("Vivek Kumar Singh", 650000l, "Ballia"),
                new Employee("Govind kumar upadhya", 300l, "Delhi"),
                new Employee("Ramesh nand", 4000l, "Delhi")
                );

        Set<String> newList = emp.stream()
                .filter(a -> a.getSalary()<5000 && a.getCity().equals("Delhi"))
                .map(Employee::getFirstName)// for getting firstname
                .collect(Collectors.toSet());// set for uniqueness

        System.out.println(newList);
    }
}
