package OOP.Abstraction.Work0;

import  java.util.Scanner;

public class hinhTron implements hinhHoc{
    Scanner input = new Scanner(System.in);
    public double banKinh;
    @Override
    public void nhap() {
        System.out.print("Nhap ban kinh: ");
        banKinh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double chuvi;
        chuvi = banKinh * 2 * Math.PI;
        System.out.println("Chu vi la: " + chuvi);
    }

    @Override
    public void tinhDienTich() {
        double dientich;
        dientich = banKinh * banKinh * Math.PI;
        System.out.println("Dien tich la: " + dientich);
    }
}
