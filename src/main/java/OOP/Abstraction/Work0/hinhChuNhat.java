package OOP.Abstraction.Work0;

import java.util.Scanner;

public class hinhChuNhat implements hinhHoc{
    Scanner input = new Scanner(System.in);
    public double chieuDai;
    public double chieuRong;

    public hinhChuNhat() {

    }

    public hinhChuNhat(int chieuDai, int chieuRong) {

    }

    @Override
    public void nhap() {
        System.out.print("Nhap chieu dai: ");
        chieuDai = input.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double chuvi;
        chuvi = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi la: " + chuvi);
    }

    @Override
    public void tinhDienTich() {
        double dientich;
        dientich = chieuDai * chieuRong;
        System.out.println("Dien tich la: " + dientich);
    }
}
