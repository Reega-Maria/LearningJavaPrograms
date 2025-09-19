package ex_01_Java_Basics;

public class Lab013_Variables {
    public static void main(String[] args) {
        System.out.println("Main with String[] args");
        main("Hello");//calling the overloaded main
    }

    public static void main(String args) {
        System.out.println("Main with single String arg: " + args);

    }
}
