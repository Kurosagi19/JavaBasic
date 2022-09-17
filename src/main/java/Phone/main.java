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
        System.out.println("( 1. Quan ly dien thoai                         )");
        System.out.println("( 2. Quan ly cong cu                            )");
        System.out.println("( 0. Dong phan mem                              )");
        System.out.println("=================================================");
        do{
            System.out.print("Chon: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Dang vao Quan ly dien thoai:");
                    menuP();
                    break;
                }
                case 2: {
                    System.out.println("Dang vao Quan ly cong cu:");
                    menuT();
                    break;
                }
                case 0: {
                    System.out.println("Thoat");
                    System.exit(0);
                }
                default: {
                    System.out.println("So da nhap khong hop le.");
                    System.out.println("Vui long nhap lai.");
                    mainMenu();
                    break;
                }
            }
        } while (choice >= 3 || choice < 0);
    }

    public static void menuP(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~ QUAN LY DIEN THOAI ~~~~~~~~~~~~~~~");
        System.out.println("| 1. Them DT moi.                                |");
        System.out.println("| 2. Sua thong tin DT.                           |");
        System.out.println("| 3. Xoa thong tin DT.                           |");
        System.out.println("| 4. Hien thi tat ca DT.                         |");
        System.out.println("| 0. Quay ve trang truoc.                        |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Chon: ");
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Ban dang o them DT moi.");
                    Phones.add();

                    break;

                case 2:
                    System.out.println("Ban dang o sua thong tin DT.");
                    Phones.fix();
                    System.out.println("Sua hoan tat!");
                    break;

                case 3:
                    System.out.println("Ban dang o xoa thong tin DT.");
                    Phones.del();
                    break;
                case 4:
                    System.out.println("Ban dang o hien thi tat ca DT.");
                    Phones.display();
                    break;

                case 0:
                    System.out.println("Quay tro lai trang chu.");
                    mainMenu();
                    break;

                default: {
                    System.out.println("So da nhap khong hop le.");
                    System.out.println("Vui long nhap lai.");
                    menuP();
                    break;
                }
            }
        } while (choice > 4 || choice < 0);
        menuP();
    }

    public static void menuT() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("++++++++++++++++ QUAN LY CONG CU ++++++++++++++++");
        System.out.println("|| 1. Tim kiem theo Nha san xuat.              ||");
        System.out.println("|| 2. Sap xep theo Ngay san xuat.              ||");
        System.out.println("|| 3. Sap xep theo Gia.                        ||");
        System.out.println("|| 4. Tim kiem theo Gia.                       ||");
        System.out.println("|| 0. Quay ve trang truoc.                     ||");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Chon: ");
        choice = input.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Ban dang o Tim kiem theo Nha san xuat.");
                    Phones.filterManu();
                    break;
                case 2:
                    System.out.println("Ban dang o Sap xep theo Ngay san xuat.");
                    Phones.sortDate();
                    break;
                case 3:
                    System.out.println("Ban dang o Sap xep theo Gia.");
                    Phones.sort();
                    break;
                case 4:
                    System.out.println("Ban dang o Tim kiem theo Gia.");
                    Phones.filterPrice();
                    break;
                case 0:
                    System.out.println("Quay tro lai trang chu.");
                    main.mainMenu();
                    break;
                default: {
                    System.out.println("So da nhap khong hop le.");
                    System.out.println("Vui long nhap lai.");
                    menuT();
                    break;
                }
            }
        } while (choice > 4 || choice < 0);
        menuT();
    }
}
