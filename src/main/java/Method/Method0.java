package Method;
//C/C++/PHP function = một chức năng nào đó
//- Quản lý phân hóa
//- Tối ưu code (dễ debug)
//- Tái sử dụng code
//Java method: phương thức
//- Cách đặt tên method: giống cách đặt tên biến
//ĐN một method:
//       <Access Modifier> Static <kiểu dữ liệu> <tên method> (<danh sách tham số>) -> cho biết cần truyền vào method những đối số nào, có kiểu dữ liệu nào
//                                                                     -> tham số = <kiẻu dữ liệu> <tên tham số>
//        {
//        khối lệnh;
//        return <giá trị cùng kiểu dữ liệu với method>
//        }
//Muốn dùng method phải gọi method
//=> <tên method> (<danh sách đối số>)
// Lưu ý: danh sách tham số khác danh sách đối số
// Quy tắc của danh sách đối số:
//- Danh sách tham số có n tham số thì danh sách đối số cũng phải có n đối số
//- Từng đối số phải có kiểu dữ liệu với tham số tương ứng

// Cách tách các method:
// B1: Viết hết vào main (spagetti)
// B2: Xác định có bao nhiêu chức năng
// B3: Tách từng chức năng ra từng method

// Phạm vi của biến:
// Biến có 2 phạm vi:
// + local variable: biến cục bộ
// biến cục bộ là biến được khai báo trong một method và chỉ dùng trong method đó
// + global variable: biến toàn cục
// biến toàn cục là biến được khai báo ngoài tất cả các method và có thể dùng trong mọi method
