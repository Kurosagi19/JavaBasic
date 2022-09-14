package Method;

import java.util.Scanner;

public class exampleMethod0 {

    public static int nhap() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        n = input.nextInt();
        return n;
    }

    public static void tinh_tong(int m, int n) {
        int tong = m + n;
        System.out.println("Tong = " + tong);
    }

//    Method tinh hieu
    public static void tinh_hieu(int a, int b) {
        int hieu = a - b;
        System.out.println("Hieu = " + hieu);
    }

    //    Method tinh tich
    public static void tinh_tich(int a, int b) {
        int tich = a * b;
        System.out.println("Tich = " + tich);
    }

    //    Method tinh thuong
    public static void tinh_thuong(int a, int b) {
        double thuong = a / b;
        System.out.println("Thuong = " + thuong);
    }

    public static void main(String[] args) {

//        Có 5 method: nhập, tổng, hiệu, tích, thương
                int a, b;
                a = nhap();
                b = nhap();
                tinh_tong(a, b);
                tinh_hieu(a, b);
                tinh_tich(a, b);
                tinh_thuong(a, b);
            }
        }
