package OOP.Polymorphism.Examples2.DaGiac;

public class hinhChuNhat extends hinhHoc {
    public void output() {
        System.out.println(doiXung);
        // Khong dung duoc hinh2D do Private, muon dung duoc phai dung getter, setter
        System.out.println(getHinh2D());
    }
}
