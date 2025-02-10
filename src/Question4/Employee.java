package Question4;

class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
        System.out.println("Creating Employee: "+ name);
    }

    public String getName(){
        return name;
    }

}
