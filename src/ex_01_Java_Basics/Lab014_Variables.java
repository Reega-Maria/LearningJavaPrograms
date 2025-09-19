package ex_01_Java_Basics;
public class Lab014_Variables {
        public static void main(String[] args) {
            // data_type variable_name =  variable_value
            byte age_sunil = 45; //byte range: –128 to 127

            // short age_pramod = 65;
            // byte -> data type - type of container
            //  age_sunil ->  variable_name |  identifier
            // = -> Assignment Operator ?  (after some time)
            // 65 -> Variable Value |  Literal


            age_sunil = 122;
            age_sunil = 111;//The variable keeps the latest value.
            //After the last line, age_sunil = 111.
            System.out.println(age_sunil); //If you try to assign age_sunil = 200; you’ll get a compile-time error because 200 is outside that range.


        }
    }

