package loop;

public class Main {
    public static void main(String[] arg) {
        // In ra cac so tu 0 den 49
        int a;
        // Vong lap for
        System.out.println("-------for-------");
        for (a = 0; a < 50; a++) {
            System.out.println(a);
        }
        // Vong lap while
        System.out.println("-------while-------");
        a = 0;
        while (a < 50) {
            System.out.println(a);
            a++;
        }
        // Vong lap do...while
        System.out.println(".......do...while.......");
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 50);
    }
}

