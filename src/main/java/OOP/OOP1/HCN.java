package OOP.OOP1;

// Khoi tao Class HCN
public class HCN {
    public int chieuDai;
    public int chieuRong;

    public void tinhChuVi() {
        int chuvi = 0;
        chuvi = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + chuvi);
    }

    public void tinhDienTich() {
        int dientich = 0;
        dientich = chieuDai * chieuRong;
        System.out.println("Dien tich hinh chu nhat la: " + dientich);
    }

    public HCN() {
    }

    public HCN(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
}

