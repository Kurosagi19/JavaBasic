package Method;

import java.util.Scanner;

public class example2Method0 {
    // Method nhap
    public static int nhap() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Nhap so: ");
        n = input.nextInt();
        return n;
    }

    // Method kiem_tra
    public static void kiem_tra(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = (-c) / b;
                System.out.println("Phuong trinh co nghiem: x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x1 = x2 = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    // Method Main
    public static void main(String[] args) {
        double a, b, c;
        a = nhap();
        b = nhap();
        c = nhap();
        kiem_tra(a, b, c);
    }
}
