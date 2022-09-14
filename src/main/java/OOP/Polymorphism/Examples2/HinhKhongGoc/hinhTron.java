package OOP.Polymorphism.Examples2.HinhKhongGoc;

import OOP.Polymorphism.Examples2.DaGiac.hinhHoc;

public class hinhTron extends hinhHoc {
    public static void main(String[] args) {
        hinhTron ht = new hinhTron();
        System.out.println(ht.ten);
        // Khong dung duoc tongCacGoc do Default, doiXung do Protected, hinh2D do Private. Muon dung phai co getter, setter
        ht.getDoiXung();
        ht.getHinh2D();
    }
}
