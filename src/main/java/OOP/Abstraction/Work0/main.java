package OOP.Abstraction.Work0;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hinh chu nhat");
        hinhChuNhat hcn = new hinhChuNhat();
        hcn.nhap();
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        System.out.println("Hinh vuong");
        hinhVuong hv = new hinhVuong();
        hv.nhap();
        hv.tinhChuVi();
        hv.tinhDienTich();

        System.out.println("Hinh tron");
        hinhTron ht = new hinhTron();
        ht.nhap();
        ht.tinhChuVi();
        ht.tinhDienTich();

        System.out.println("Hinh tru");
        hinhTron day = new hinhTron();
        day.nhap();
        hinhTru htr = new hinhTru(10, day);
        System.out.println("Dien tich xung quanh: " + htr.dienTichXungQuanh(htr.chieuCao, htr.day));
    }
}
