package ex_07_Increment_Decrement_Op;

public class Lab071_Id_Op_Pos {
        public static void main(String[] args) {

//        int a = 10;
//        System.out.println(++a);


            // POST increment  = Print first and then increase.
            int a_post = 10;
            int b = a_post++; //first assign then increment
            System.out.println(a_post);
            System.out.println(b);

            // ERT ( Exp and Result Table)
            // LNo |  a_post | b
            // 11  |  10 | NA
            // 12  |  11  | 10
            // 14  |  11  | 10




        }
    }
//int a_post = 10;
//int b = ++a_post;  // Pre-increment: first increment, then assign
//System.out.println(a_post);  // Will print 11
//System.out.println(b);       // Will print 11

