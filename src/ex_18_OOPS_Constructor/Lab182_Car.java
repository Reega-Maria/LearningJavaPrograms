package ex_18_OOPS_Constructor;

public class Lab182_Car {
    public static void main(String[] args) {
        LoginPage l = new LoginPage();

        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);
    }
}