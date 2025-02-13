package Question123;

import java.util.Optional;
//Creating custom exceptions just for practice
class NullFieldException extends RuntimeException{
    public NullFieldException(String message){
        super(message);
    }
}

public record Student(int id, String name, String standard) {

    public Student{
        name = Optional.ofNullable(name)
                .orElseThrow(()->new NullFieldException("name can't be null"));//passed my customexception
        standard = Optional.ofNullable(standard)
                .orElseThrow(()-> new NullFieldException("standard can't be null"));
    }

    public static void main(String[] args) {
        Student st1 = new Student(101,"Arsh", "B.tech");
        Student st2 = new Student(101,"Arsh", "B.tech");
        Student st3 = new Student(201,"Madhav","12th");
//        Student st4 = new Student(201,"Ravi",null); //will throw my custom exception

        System.out.println(st1);
        System.out.println(st2.equals(st1));
        System.out.println(st1.hashCode() == st2.hashCode());
        System.out.println(st2.hashCode());

//        System.out.println(st3.equals(st4));
    }
}
