package OOP.Abstraction.Work0;

public class hinhTru {
    public double chieuCao;
    public hinhTron day;

    public double dienTichXungQuanh(double chieuCao, hinhTron day) {
        double dien_tich_xung_quanh = day.banKinh * chieuCao;
        return dien_tich_xung_quanh;
    }

    public double dienTichToanPhan(double chieuCao, hinhTron day) {
        double dien_tich_toan_phan = dienTichXungQuanh(chieuCao, day) * 2 * (Math.pow(day.banKinh, 2) * Math.PI);
        return dien_tich_toan_phan;
    }

    public double theTich(double chieuCao, hinhTron day) {
        double the_tich = Math.PI * (Math.pow(day.banKinh, 2));
        return the_tich;
    }

    public hinhTru(double chieuCao, hinhTron day) {
        this.chieuCao = chieuCao;
        this.day = day;
    }
}

