package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        // Khai bao
        int n;
        int array[] = new int[100];
        // Nhap so phan tu
            System.out.print("Nhap so phan tu cua mang: ");
            n = input.nextInt();
        // Nhap cac phan tu
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            System.out.print("Nhap phan tu thu " + x + ": ");
            array[i] = input.nextInt();
        }
        // Gan phan tu thu nhat cho min va max
        int min = array[0];
        int max = array[0];
        // Vong lap for qua tung phan tu
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        // In ket qua ra man hinh
        System.out.println("Phan tu nho nhat la: " + min);
        System.out.println("Phan tu lon nhat la: " + max);
    }
}

