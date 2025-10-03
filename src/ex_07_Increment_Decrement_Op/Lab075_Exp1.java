package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(a++ + ++a);//
            System.out.println(a);

            // a++ ->  A    Value used = 10
            // After using, a becomes 11
            // +
            // ++a -> B     First increment a to 12
            // Then use the value 12

        }
    }

