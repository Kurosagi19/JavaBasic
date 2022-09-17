package Phone;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("========== PHAN MEM QUAN LY DIEN THOAI ==========");
        System.out.println("| 1. Quan ly thiet bi                           |");
        System.out.println("| 2. Cong cu chinh sua                          |");
        System.out.println("| 0. Thoat chuong trinh                         |");
        System.out.println("=================================================");
        do{
            System.out.print("Chon: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("======= QUAN LY THIET BI =======");
                    menuPhone();
                    break;
                }
                case 2: {
                    System.out.println("======= CONG CU CHINH SUA =======");
                    menuTool();
                    break;
                }
                case 0: {
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                }
                default: {
                    System.out.println("So da nhap khong hop le");
                    System.out.println("Vui long nhap lai");
                    mainMenu();
                    break;
                }
            }
        } while (choice >= 3 || choice < 0);
    }

    public static void menuPhone(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("---------------- QUAN LY THIET BI ----------------");
        System.out.println("| 1. Them dien thoai moi                         |");
        System.out.println("| 2. Sua thong tin dien thoai                    |");
        System.out.println("| 3. Xoa thong tin dien thoai                    |");
        System.out.println("| 4. Hien thi tat ca thiet bi hien co            |");
        System.out.println("| 0. Quay ve menu truoc                          |");
        System.out.println("--------------------------------------------------");
        System.out.print("Chon: ");
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Ban dang o them dien thoai moi");
                    Phones.add();

                    break;

                case 2:
                    System.out.println("Ban dang o sua thong tin dien thoai");
                    Phones.fix();
                    System.out.println("Sua thong tin hoan tat !");
                    break;

                case 3:
                    System.out.println("Ban dang o xoa thong tin dien thoai");
                    Phones.del();
                    break;
                case 4:
                    System.out.println("Ban dang o hien thi tat ca dien thoai");
                    Phones.display();
                    break;

                case 0:
                    System.out.println("Quay tro lai trang chu");
                    mainMenu();
                    break;

                default: {
                    System.out.println("So da nhap khong hop le");
                    System.out.println("Vui long nhap lai");
                    menuPhone();
                    break;
                }
            }
        } while (choice > 4 || choice < 0);
        menuPhone();
    }

    public static void menuTool() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("+++++++++++++++ QUAN LY CONG CU ++++++++++++++");
        System.out.println("| 1. Tim kiem theo nha san xuat              |");
        System.out.println("| 2. Sap xep theo ngay san xuat              |");
        System.out.println("| 3. Sap xep theo gia                        |");
        System.out.println("| 4. Tim kiem theo gia                       |");
        System.out.println("| 0. Quay ve trang truoc                     |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Chon: ");
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Ban dang o Tim kiem theo nha san xuat");
                    Phones.filterManu();
                    break;
                case 2:
                    System.out.println("Ban dang o Sap xep theo ngay san xuat");
                    Phones.sortDate();
                    break;
                case 3:
                    System.out.println("Ban dang o Sap xep theo gia");
                    Phones.sort();
                    break;
                case 4:
                    System.out.println("Ban dang o Tim kiem theo gia");
                    Phones.filterPrice();
                    break;
                case 0:
                    System.out.println("Quay tro lai trang chu");
                    main.mainMenu();
                    break;
                default: {
                    System.out.println("So da nhap khong hop le");
                    System.out.println("Vui long nhap lai");
                    menuTool();
                    break;
                }
            }
        } while (choice > 4 || choice < 0);
        menuTool();
    }
}
