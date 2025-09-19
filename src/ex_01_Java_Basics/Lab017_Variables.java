package ex_01_Java_Basics;

public class Lab017_Variables {

    // static variable (class level)
        static String course = "Java";

        // instance variable (object level)
        String trainer = "Reega";

        public static void main(String[] args) {
            // local variable
            int studentCount = 20;
            System.out.println("Course: " + course);
            System.out.println("Students: " + studentCount);

            // call overloaded main
            main("Welcome to variables demo");
        }

        public static void main(String args) {
            // local variable
            String message = args;
            System.out.println("Message: " + message);
        }
    }


