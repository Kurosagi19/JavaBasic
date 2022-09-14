package Method;

import java.util.Scanner;

public class example1Method0 {
    //    Nhap 3 so thuc. Kiem tra 3 so do co phai canh tam giac khong. Luu y: viet ra cac method rieng biet
//    Method nhap
    public static int nhap() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so: ");
        n = input.nextInt();
        return n;
    }

    //    Method kiem tra
    public static void kiem_tra(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("a, b, c la canh hinh tam giac");
        } else {
            System.out.println("a, b, c khong phai la canh hinh tam giac");
        }
    }

    //    Main
    public static void main(String[] args) {
        int a, b, c;
        a = nhap();
        b = nhap();
        c = nhap();
        kiem_tra(a, b, c);
    }
}

