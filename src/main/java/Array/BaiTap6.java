package Array;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhap 40 so nguyen tu ban phim
        // Tinh tong 40 so nguyen do
//        int arr[] = {1, 2, 3, 4, 5};
//        int arr1[] = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i + "] = " + arr[i]);
//       }
        int mang[] = new int[10];
        int tong = 0;
        // Nhap mang
        for (int i = 0; i < mang.length; i++) {
            System.out.print("mang[" + i +"] = ");
            mang[i] = input.nextInt();
            // Tinh tong
            for (i = 0; i < mang.length; i++) {
                tong += mang[i];
            }
        }
    }
}

