package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    Double Age;
    Double Salary;
    String Name;

    public Employee(Double age, Double salary, String name) {
        Age = age;
        Salary = salary;
        Name = name;
    }

    public Double getAge() {
        return Age;
    }
    public void setAge(Double age) {
        Age = age;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Age=" + Age +
                ", Salary=" + Salary +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee second) {
        String[] firstPart = this.Name.split(" ");
        String[] secondPart = second.Name.split(" ");

        String firstFirstName = firstPart[0];
        String firstLastName = firstPart.length >1 ? firstPart[1] : "";

        String secondFirstName = secondPart[0];
        String secondLastName = secondPart.length > 1 ? secondPart[1] : "";

        int firstNameCompare = firstFirstName.compareToIgnoreCase(secondFirstName);
        if(firstNameCompare != 0){
            return firstNameCompare;
        }
        return firstLastName.compareToIgnoreCase(secondLastName);
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(27.0, 35000.0, "kunal khuswaha"));
        employeeList.add(new Employee(33.0, 150000.0, "Rishav singh"));
        employeeList.add(new Employee(23.0, 55000.0, "Arsh Nadeem"));


        Collections.sort(employeeList);
        System.out.println("Default sorting via name: ");
        for(Employee e: employeeList){
            System.out.println(e);
        }
        System.out.println();
        Collections.sort(employeeList, new SalaryComparator());
        System.out.println("Sorting via salary");
        for(Employee e: employeeList){
            System.out.println(e);
        }

    }
}

