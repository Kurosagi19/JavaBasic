package loop;
import java.util.Scanner;
public class example2 {
    public static void main(String[] arg) {
        // Tinh n giai thua voi n nhap tu ban phim
        int n;
        int i = 1, giaithua = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n = ");
        n = input.nextInt();
        if (n < 0) {
            System.out.println("n khong co giai thua");
        } else if (n == 0) {
            System.out.println("n giai thua = " + giaithua);
        }
        else {
            for (i = 1; i <= n; i++) {
                giaithua *= i;
            }
        }
        System.out.println("Giai thua cua " + n + " la " + giaithua);
    }
}



