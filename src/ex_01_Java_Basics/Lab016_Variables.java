package ex_01_Java_Basics;

public class Lab016_Variables {
        public static void main(String[] args) {
            // byte age = 128; // Out of range.
            int age = 128;
            age = age+1; //age becomes 129.
            age = 76; //overwrite it again — now age is 76.
            System.out.println(age);
        }
    }

