package OOP.Polymorphism.Work1;

public class Teacher extends Person {
    public double canCuoc;
    public String email;
    public String chuyenNganh;
    public double luongCoBan;
    public double luongTheoGio;
    public double soGioLam;
    public double thang;
    public double nam;

    public void nhap() {
        System.out.println("Nhap thong tin giao vien:");
        System.out.print("Ho va ten: ");
        ten = input.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = input.nextLine();
        System.out.print("Dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Ngay thang nam sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("So can cuoc: ");
        canCuoc = input.nextDouble();
        System.out.print("Email: ");
        email = input.nextLine();
        input.nextLine();
        System.out.print("Chuyen nganh: ");
        chuyenNganh = input.nextLine();
        System.out.print("Luong theo gio: ");
        luongTheoGio = input.nextDouble();
        System.out.print("So gio lam: ");
        soGioLam = input.nextDouble();
        System.out.print("Nhap thang :");
        thang = input.nextDouble();
        System.out.print("Nhap nam: ");
        nam = input.nextDouble();
    }

    public String toString() {
        return "Giao vien" + '\n' +
                "Ho va Ten: " + ten + '\n' +
                "Gioi tinh: " + gioiTinh + '\n' +
                "Dia chi: " + diaChi + '\n' +
                "Ngay sinh: " + ngaySinh + '\n' +
                "Email: " + email + '\n' +
                "So Can Cuoc: " + canCuoc + '\n' +
                "Chuyen nganh: " + chuyenNganh + '\n' +
                "Luong co ban: " + luongCoBan + '\n' +
                "Luong theo gio: " + luongTheoGio + '\n' +
                "So gio lam: " + soGioLam + '\n';
    }

    public void tinhLuong() {
        luongCoBan = luongTheoGio * soGioLam;
        System.out.println("Tong so luong: " + luongCoBan);
    }
}
