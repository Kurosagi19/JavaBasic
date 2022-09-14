package OOP.Inherited.Person;


public class studentMain extends Person {
    static studentMain sv1 = new studentMain();

    public void nhapThongTin() {
        System.out.println("Nhap thong tin sinh vien");
        System.out.print("Ho va ten: ");
        ten = input.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = input.nextLine();
        System.out.print("Dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Ngay thang nam sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("Ma sinh vien: ");
        maSV = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Diem trung binh: ");
        diemTB = input.nextDouble();
    }

    public void hocBong() {
      if (this.diemTB < 8) {
          System.out.print("Sinh vien khong du dieu kien nhan hoc bong");
      } else {
          System.out.print("Sinh vien du dieu kien nhan hoc bong");
      }
    }

    public void inThongTin() {
        System.out.println(super.toString());
    }
}
