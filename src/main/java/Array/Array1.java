package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        //Khai bao
        int n, hieu = 0;
        // Nhap so phan tu
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n = input.nextInt();
        } while (n < 0);
        // Nhap cac phan tu
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            System.out.print("Nhap phan tu thu " + x + ": ");
            array[i] = input.nextInt();
        }
        // Tinh hieu cac phan tu
        for (int i = 0; i < n; i++) {
            hieu -= array[i];
        }
        // In ket qua ra man hinh
        System.out.println("Hieu cac phan tu trong mang la: " + hieu);
    }
}
