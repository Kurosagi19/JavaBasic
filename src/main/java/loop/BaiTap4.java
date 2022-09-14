package loop;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int chieucao;
        System.out.print("Nhap chieu cao cua tam giac: ");
        chieucao = input.nextInt();
        for (int i = 1; i <= chieucao; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}

