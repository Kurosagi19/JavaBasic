package OOP.Polymorphism.Examples;

public class personex {
    public String name;
    public int tuoi;
    public String diaChi;

    public personex() {

    }

    public personex(String name, int tuoi, String diaChi) {
    }

    public void inputPerson() {
        System.out.println(this.name);
    }

    public void inputPerson(String name, int tuoi, String diaChi) {
        this.name = name;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public void output() {
        System.out.println(this.name);
    }
}
