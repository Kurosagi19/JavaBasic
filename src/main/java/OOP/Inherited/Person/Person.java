package OOP.Inherited.Person;


import java.util.Scanner;

public class Person {

    public static Scanner input = new Scanner(System.in);
    public String ten;
    public String gioiTinh;
    public String diaChi;
    public String ngaySinh;
    public String maSV;
    public double diemTB;
    public String email;

    public String toString() {
        return "Student" + '\n' +
                "Ho va Ten: " + ten + '\n' +
                "Gioi tinh: " + gioiTinh + '\n' +
                "Dia chi: " + diaChi + '\n' +
                "Ngay sinh: " + ngaySinh + '\n' +
                "Email: " + email + '\n' +
                "Diem trung binh: " + diemTB + '\n';
    }
}
