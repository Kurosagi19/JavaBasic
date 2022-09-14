package JavaBasic;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Khai bao
        int a, b, c;
        // Tao Scanner de nhap du lieu
        Scanner input = new Scanner(System.in);
        // Nhap a, b, c
        System.out.print("Nhap so a: ");
        a = input.nextInt();
        System.out.print("Nhap so b: ");
        b = input.nextInt();
        System.out.print("Nhap so c: ");
        c = input.nextInt();
        // Dieu kien de a, b, c la canh hinh tam giac
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("a, b, c la canh hinh tam giac");
        }
        else {
            System.out.println("a, b, c khong phai canh hinh tam giac");
        }
    }
}

