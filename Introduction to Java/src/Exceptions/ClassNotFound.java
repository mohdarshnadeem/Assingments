package Exceptions;

public class ClassNotFound {
    public static void main(String[] args) {
        try {
//            Class.forName("java.lang.StringBuffer");
            Class.forName("arsh");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }finally{
            System.out.println("always");
        }
    }
}