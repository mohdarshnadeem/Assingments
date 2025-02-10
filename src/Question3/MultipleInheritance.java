package Question3;

public interface MultipleInheritance {
    default void show(){
        System.out.println(" I am from Me");
    }
}

interface A extends MultipleInheritance{
    @Override
     default void show(){
        System.out.println("Hi I am from 'A', A for Arsh");
    }
}


interface B extends MultipleInheritance{
    @Override
    default void show(){
        System.out.println("Hi I am from 'B', B for Banana");
    }
}

interface C extends A,B{

//    @Override
//    default void show() {
//        System.out.println(" Hi I am from me: C");
//    }
//    default void show(){
//        A.super.show();
//    }

    default void show(){
        B.super.show();
    }
}


