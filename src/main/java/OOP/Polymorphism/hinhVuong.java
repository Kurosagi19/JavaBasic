package OOP.Polymorphism;

import java.util.Scanner;

public class hinhVuong extends hinhHoc {
    public double canh;

    public hinhVuong() {
    }

    public hinhVuong(double canh) {
        this.canh = canh;
    }

    public void nhapHV(Scanner input) {
        System.out.print("canh = ");
        this.canh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        this.chuVi = this.canh * 4;
    }

    @Override
    public void tinhDienTich() {
        this.dienTich = Math.pow(this.canh, 2);
    }

    @Override
    public String toString() {
        return "hinhVuong{" +
                "canh=" + canh +
                ", chuVi=" + chuVi +
                ", dienTich=" + dienTich +
                '}';
    }
}
