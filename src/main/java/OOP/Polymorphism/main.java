package OOP.Polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        hinhCN hcn1 = new hinhCN();
        hcn1.nhapHCN(input);
        hcn1.tinhChuVi();
        hcn1.tinhDienTich();
        System.out.println(hcn1.toString());
        ;

        hinhVuong hv1 = new hinhVuong();
        hv1.nhapHV(input);
        hv1.tinhChuVi();
        hv1.tinhDienTich();
        System.out.println(hv1.toString());
    }
}
