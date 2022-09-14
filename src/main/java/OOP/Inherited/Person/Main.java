package OOP.Inherited.Person;

// Tạo một lớp Person lưu trữ các thông tin sau đây (tên, giới tính, địa chỉ, ngày sinh)
// Tạo một lớp Student kế thừa từ lớp Person lưu trữ các thôn gtin sau đây (mã sinh viên, điểm trung bình, email)
// Viết một phương thức nhập thông tin của student
// Viết một phương thức hiển thị thông tin của student
// Viết phương trình xem xét có học sinh nào được học bổng không ?
// Điểm trung bình hơn 8.0 sẽ được học bổng


public class Main {
    public static void main(String[] args) {
        studentMain sv1 = new studentMain();
        sv1.nhapThongTin();
        sv1.inThongTin();
        sv1.hocBong();
    }
}
