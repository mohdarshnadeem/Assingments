package Question4;

  class ConstructerReferenceExample {
      public static void main(String[] args) {
          // Using constructor reference instead of manually calling new Employee()
          EmployeeFactory factory = Employee::new;

          // Creating employee objects using constructor reference
          Employee e1 = factory.createEmployee("Arsh Nadeem");
          Employee e2 = factory.createEmployee("Rohit Gupta");
          Employee e3 = factory.createEmployee("Anurag");

          System.out.println("Employee: "+ e1.getName());
          System.out.println("Employee: "+ e2.getName());
          System.out.println("Employee: "+ e3.getName());
      }
}
