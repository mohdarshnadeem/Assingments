package Question2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getSalary().compareTo(t1.getSalary());
    }
}
