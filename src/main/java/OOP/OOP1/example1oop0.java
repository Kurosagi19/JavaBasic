package OOP.OOP1;

import java.util.Scanner;

public class example1oop0 {
    // Tao CLass HCN gom 2 thuoc tinh: chieuDai, chieuRong gom 2 Constructor: 1 Constructor khong co tham so, 1 Constructor co day du tham so
    // 2 phuong thuc tinhChuVi(), tinhDienTich()
    // Tao 2 HCN: tinh chu vi, dien tich 2 hinh do
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Hinh chu nhat 1=====");
        HCN hcn1 = new HCN();
        System.out.print("Nhap chieu dai: ");
        hcn1.chieuDai = input.nextInt();
        System.out.print("Nhap chieu rong: ");
        hcn1.chieuRong = input.nextInt();
        hcn1.tinhChuVi();
        hcn1.tinhDienTich();

        System.out.println();
        System.out.println("=====Hinh chu nhat 2=====");
        HCN hcn2 = new HCN();
        System.out.print("Nhap chieu dai: ");
        hcn2.chieuDai = input.nextInt();
        System.out.print("Nhap chieu rong: ");
        hcn2.chieuRong = input.nextInt();
        hcn2.tinhChuVi();
        hcn2.tinhDienTich();
    }
}
