package OOP.Polymorphism.Examples2.DaGiac;

public class hinhHoc {
    public String ten = "hinhHoc";
    int tongCacGoc = 360;
    protected String doiXung = "co";

    public String getDoiXung() {
        return doiXung;
    }
    public void setDoiXung(String doiXung) {
        this.doiXung = doiXung;
    }
    private String hinh2D = "dung";

    public String getHinh2D() {
        return hinh2D;
    }

    public void setHinh2D(String hinh2D) {
        this.hinh2D = hinh2D;
    }
    private void kiemTra() {
        System.out.println("Kiem tra");
    }
}
