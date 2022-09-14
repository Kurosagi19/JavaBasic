package loop;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int n, i = 0, so = 0;
        String soNguyen = "";
        System.out.print("Nhap so n: ");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            int dem = 0;
            for (so = i; so >= 1; so--) {
                if (i % so == 0) {
                    dem = dem + 1;
                }
            } if (dem == 2) {
                soNguyen = soNguyen + i + " ";
            }
        } System.out.println("Cac so nguyen to tu 1 den " + n + " la: ");
        System.out.print(soNguyen);
    }
}
