package Method;

import java.util.Scanner;

public class example3Method0 {
    // Nhap mang gom n so nguyen
    // Tinh tong cac phan tu (method)
    // Tim max min (method)

    // Global variable
    public static Scanner input = new Scanner(System.in);

    // Method nhap n
    public static int input_n() {
        int n;
        System.out.print(" Nhap so phan tu cua mang: ");
        n = input.nextInt();
        return n;
    }

    // Method nhap mang
    public static int[] input_arr(int n) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int x = i + 1;
            System.out.print("Mang[" + x + "] = ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    // Method tinh tong
    public static void tinh_tong(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
            System.out.println("Tong la: " + tong);
        }
    }

    // Method max min
    public static void max_min(int n, int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // In ket qua ra man hinh
        System.out.println("Phan tu nho nhat la: " + min);
        System.out.println("Phan tu lon nhat la: " + max);
    }

    // Method Main
    public static void main(String[] args) {
        int n = input_n();
        int[] arr = input_arr(n);
        tinh_tong(arr);
        max_min(n, arr);
    }
}

