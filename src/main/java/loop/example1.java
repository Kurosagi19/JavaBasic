package loop;
import java.util.Scanner;
public class example1 {
    public static void main(String[] arg) {
        // Tinh tong cac so chan tu 1 den 10000
        int tong = 0;
        for (int a = 1; a < 10000;) {
           if (a % 2 == 0) {
               tong += a;
           }
           a++;
        }
        System.out.println("Tong = " + tong);

        // Tinh tong cac so tu 1 den n voi n nhap tu ban phim
        int n, tong_2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                tong_2 += i;
            }
        }
        System.out.println("Tong_2 = " + tong_2);
        return;
    }
}
