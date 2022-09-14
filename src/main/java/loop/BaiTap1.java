package loop;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Nhap so n: ");
        n = input.nextInt();
        boolean songuyen = true;
        for (int i = 2; i <= n/2; i++) {
            if ( n % i == 0) {
                songuyen = false;
                break;
            }
        } if (songuyen) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
}

