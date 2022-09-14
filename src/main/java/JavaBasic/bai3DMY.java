package JavaBasic;

import java.util.Scanner;
public class bai3DMY {
    public static void main(String[] arg) {
        // Nhap thang, hien thi so ngay cua thang vua nhap
        int thang, nam;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        thang = input.nextInt();
        switch(thang)
        {
            case 1: ;
            case 3: ;
            case 5: ;
            case 7: ;
            case 8: ;
            case 10: ;
            case 12:
                System.out.println("Thang " + thang + " co 31 ngay");
            case 4: ;
            case 6: ;
            case 9: ;
            case 11:
                System.out.println("Thang " + thang + " co 30 ngay");
            case 2:
                System.out.print("Nhap nam");
                nam = input.nextInt();
                if (nam % 4 == 0)
                {
                    System.out.println("Thang " + thang + " co 29 ngay");
                }
        }
    }
}
