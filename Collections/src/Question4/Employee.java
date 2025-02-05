package Question4;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;// determines reference point to the same object in the memory: for duplicates
        // if i am performing comparing an object to itself then it is unnecessary to perform any further checks
        if(obj == null || getClass() != obj.getClass()) return false;// to ensure obj is not that is being compared
        // and of same class as the current object, to avoid nullpointerexception.

        Employee emp = (Employee) obj;
        return age == emp.age && Objects.equals(name, emp.name) && Objects.equals(designation, emp.designation);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}
