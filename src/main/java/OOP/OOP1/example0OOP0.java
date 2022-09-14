package OOP.OOP1;

import java.util.Scanner;

public class example0OOP0 {
    public static void main(String[] args) {
// Khoi tao doi tuong cho class con nguoi
        conNguoi cn1 = new conNguoi();
        System.out.println("Nhap thong tin cho cn1");
        Scanner input = new Scanner(System.in);
        System.out.print("Ho ten: ");
        cn1.ten = input.nextLine();
        System.out.print("Tuoi: ");
        cn1.tuoi = input.nextInt();
        System.out.print("Dia chi: ");
        input.nextLine();
        cn1.diaChi = input.nextLine();
        System.out.print("So dien thoai: ");
        cn1.soDienThoai = input.nextLine();
        cn1.an();
        cn1.choi();
        cn1.ngu();
        System.out.println(cn1.toString());

        conNguoi cn2 = new conNguoi("Tran Van B", 22, "TPHCM", "0147852369");
        System.out.println(cn2.toString());
    }
}

