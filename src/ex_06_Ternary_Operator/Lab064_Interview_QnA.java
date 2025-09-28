package ex_06_Ternary_Operator;

public class Lab064_Interview_QnA {
        public static void main(String[] args) {
            int age = 21;

            // Nested Ternary
            // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

            String result = (age > 18) //if age>18 false go to step 13
                    ? (age > 25 ? "You can drink" // if age>25 true else go to step 12
                    : "You can go to GOA, ButN can't Drink")
                    : "No";
            System.out.println(result);
        }
    }

