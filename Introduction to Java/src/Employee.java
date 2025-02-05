public class Employee {

    String fName;
    String lName;
    int age;
    String designation;

    public Employee(String fName, String lName, int age, String designation) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.designation = designation;
    }

    public Employee() {
        System.out.println("default constructor");
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee Name: " + fName +" " + lName +"\n" +
                "Employee age: "+age+"\n" +"Designation: "+designation;
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Arsh","Nadeem",23,"SDE trainee");
        System.out.println(emp.toString());
        emp.setDesignation("Software developer trainee");
        System.out.println();
        Integer a = 2;
        Integer b = 2;
        DOub
        System.out.println(a == b);
        System.out.println(emp.toString());

    }
}
