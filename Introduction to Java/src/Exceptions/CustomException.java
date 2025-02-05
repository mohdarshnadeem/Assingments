package Exceptions;

public class CustomException {
    public static void main(String[] args) {

        try{
            throw new MyException(" Arsh Exception");
        }catch (MyException e){
            System.out.println("Catching" + e.getMessage());
            e.printStackTrace();
        }
    }
}

class MyException extends RuntimeException{
    MyException(String message){
        super(message);
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}


