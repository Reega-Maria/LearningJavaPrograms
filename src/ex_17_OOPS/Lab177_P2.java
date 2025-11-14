package ex_17_OOPS;

public class Lab177_P2 {
    public static void main(String[] args) {
        class ATBx {
            String name;
            void doAssignment() {
                System.out.println(name + " is doing assignment");
            }
        }

        class Baby {
            // some properties or methods (optional)
        }

        ATBx amit = new ATBx();
        // Class - ATBx
        // Object Ref - amit
        // Object -> new ATBx();

        amit.name = "Amit sharma";
        amit.doAssignment();

        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby b3 = new Baby();
    }
}