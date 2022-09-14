package OOP.Polymorphism.Examples;

public class Student extends personex {
    public String id;
    public String email;

    public void output() {
        System.out.println(this.name + " - " + this.id);
    }
    public void output(String name, int tuoi, String diaChi) {
        System.out.println(this.name + " - " + this.tuoi + " - " + this.diaChi + " - " + this.id + " - " + this.email);
    }
}
