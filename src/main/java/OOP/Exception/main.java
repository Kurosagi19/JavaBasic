package OOP.Exception;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        try {
            double thuong;
            thuong = a / b;
            System.out.println("a / b = " + thuong);
        }
        catch (Exception ex) {
            System.out.println("Phat hien Exception");
        }
    }
}
