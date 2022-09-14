package OOP.Polymorphism;

import java.util.Scanner;

public class hinhCN extends hinhHoc {
    public double chieuDai;
    public double chieuRong;

    public hinhCN() {
    }

    public hinhCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhapHCN(Scanner input) {
        System.out.print("Chieu dai = ");
        this.chieuDai = input.nextDouble();
        System.out.print("Chieu rong = ");
        this.chieuRong = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        this.chuVi = (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public void tinhDienTich() {
        this.dienTich = this.chieuDai * this.chieuRong;
    }

    @Override
    public String toString() {
        return "hinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi=" + chuVi +
                ", dienTich=" + dienTich +
                '}';
    }
}
