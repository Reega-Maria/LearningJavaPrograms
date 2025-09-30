package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
        public static void main(String[] Reega_args) {

            String input = Reega_args[0]; // 68
            System.out.println(input);
            System.out.println(input instanceof String); //True,command-line arguments come in as Strings.

            // Input - String
            // String - Int
            int age = Integer.parseInt(input);

            String result = (age < 18)
                    ? "Minor"
                    : (age <= 60) ? "Adult" : "Sr. Citizen";
            System.out.println(result);








        }
    }

