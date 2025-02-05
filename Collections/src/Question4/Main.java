package Question4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //mapping employee with salary
        Map<Employee, Double> empSalaryMap = new HashMap<>();

        Employee emp1 = new Employee("Arsh Nadeem", 23, "trainee");
        Employee emp2 = new Employee("Anurag", 24, "trainee");
        Employee emp3 = new Employee("Rohit", 22, "trainee");
        //duplicate
        Employee emp4 = new Employee("Arsh Nadeem", 23, "trainee");



        empSalaryMap.put(emp1,20000.0);
        empSalaryMap.put(emp2,25000.0);
        empSalaryMap.put(emp3,15000.0);
        empSalaryMap.put(emp4,30000.0);

//        for printing
        for(Map.Entry<Employee, Double> entry : empSalaryMap.entrySet()){
            System.out.println(entry.getKey()+" salary: "+entry.getValue());
        }

        System.out.println();
        //retrieve salary of an employee specifically
        Employee search = new Employee("Arsh Nadeem",23, "trainee");
        Double salary = empSalaryMap.get(search);
        System.out.println(search.getName()+" :"+salary);

    }
}
