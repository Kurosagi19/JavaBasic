package Array;

import java.util.Scanner;

public class BaiTap7 {
    // Nhap mang so thuc gom 10 phan tu
    // Tinh hieu cac phan tu cua mang
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        // Khai bao
        int arr[] = new int[10];
        int hieu = 0;
        // Nhap mang
        for (int i = 0; i < arr.length; i++) {
            System.out.print("mang[" + i + "] = ");
            arr[i] = input.nextInt();
        // Tinh hieu
            for (i = 0; i < arr.length; i++) {
                hieu -= arr[i];
            }
            System.out.println("Hieu cac phan tu la: " + hieu);
        }
    }
}
