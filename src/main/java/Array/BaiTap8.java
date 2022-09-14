package Array;

import java.util.Scanner;

public class BaiTap8 {
    // Nhap mang gom 10 so thuc. Sap xep mang theo chieu tang dan
    public static void main(String[] arg) {
        // Khai bao
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
//         Nhap so phan tu trong mang
//        int n;
//        System.out.print("Nhap so phan tu trong mang: ");
//        n = input.nextInt();

//         Nhap cac phan tu trong mang
        for (int i = 0; i < array.length; i++) {
            int x = i + 1;
            System.out.print("Nhap phan tu thu " + x + ": ");
            array[i] = input.nextInt();
        }

//         Sap xep cac phan tu theo chieu tang dan
        int i, j;
        int temp;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

//         In ket qua ra man hinh
        System.out.print("Sap xep cac phan tu theo thu tu tang dan: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
