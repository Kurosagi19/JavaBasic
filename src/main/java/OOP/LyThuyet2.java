// Tính chất của OOP:
//  Kế thừa: 2 class kế thừa nhau, class được kế thừa có thuộc tính phương thức nào thì class kế thừa sẽ có thuộc tính phương thức đó
//           class được kế thừa sẽ không có thuộc tính, phương thức của class kế thừa
// Có 2 loại kế thừa:
// - Đơn kế thừa: 1 cha, nhiều con
//                1 con, 1 cha
// - Đa kế thừa (không có trong java): 1 cha, nhiều con
//                                     1 class, nhiều cha

// Đa hình:
// Overloading: nạp chồng: trong 1 class tồn tại nhiều method có tên giống nhau nhưng tham số khác nhau
// Overridding: ghi đè:

// Đóng gói: thể hiện phạm vi có thể sử dụng của class, method, atribute
//           Access Modifier: public: dùng mọi nơi
//                            default: chỉ dùng trong package
//                            protected: dùng trong class, package, ngoài package nhưng trong class con
//                            private: chỉ dùng trong class chứa nó
// Thuộc tính có private có thể dùng getter, setter để làm việc trực tiếp từ bên ngoài
// Phương thức có private bắt buộc phải sử dụng trong class

// Trừu tượng: để xây dựng nên những thứ chung nhất của chương trình (khung)
// Tùy theo từng class sẽ triển khai nhưng thứ chung đó
// - 2 loại:
//   + Bán trừu tượng: thể hiển qua abstract class => abstract method: phương thức trừu tượng
//                                  Abstract class: thuộc tính, phương thức bình thường, phương thức trừu tượng
//                                                  không thể tạo đối tượng cho abstract class
//                                                  các abstract class có thể được kế thừa
//                                  Abstract method: là một loại method, chỉ có phần khai báo, không có phần thân
//                                                   khi extends, các abstract method bắt buộc phải override
// Khai báo abstract class:
//      <Access Modifier> abstract class <tên class>
//              thuộc tính;
//              Method thông thường;
//              Abstract Method;
// Khai báo abstract method:
//      <Access Modifier> abstract <kiểu dữ liệu> <tên method>(<tham số>);
//   + Trừu tượng toàn phần: Interface => chỉ chứa abstract class, không chứa các method
//Tạo Interface:
//    <Access Modifier> interface <tên interface> {
//            phương thức trừu tượng
//    }
// Class => extends 1 class
// Interface => implement
// Interface có thể implements 1 interface khác
// Class cũng có thể implements 1 hoặc nhiều interface

