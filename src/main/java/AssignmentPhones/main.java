package AssignmentPhones;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;
import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, NotSerializableException {
        int caseMain;
        int casePhone;
        int caseTool;
        boolean exit = false;
        phoneManager pm = new phoneManager();
        System.out.println("===== Chuong trinh quan ly dien thoai =====");
        System.out.println("1. Quan ly thiet bi");
        System.out.println("2. Cong cu chinh sua");
        System.out.println("0. Thoat chuong trinh");
        System.out.print("Moi nhap lua chon: ");
        caseMain = input.nextInt();
        switch (caseMain) {
            case 1:
                System.out.println("===== Quan ly thiet bi =====");
                System.out.println("1. Them thiet bi moi");
                System.out.println("2. Cap nhat thong tin thiet bi");
                System.out.println("3. Xoa thiet bi");
                System.out.println("4. Hien thi tat ca thiet bi");
                System.out.print("Moi nhap lua chon: ");
                casePhone = input.nextInt();
                switch (casePhone) {
                    case 1:
                        System.out.println("=== Them thiet bi ===");
                        pm.phoneAdd();
                        break;
                    case 2:
                        System.out.println("2. Cap nhat thong tin thiet bi");
                        pm.phoneUpdate();
                        break;
                    case 3:
                        System.out.println("3. Xoa thiet bi");
                        pm.phoneDelete();
                        break;
                    case 4:
                        System.out.println("4. Hien thi tat ca thiet bi");
                        break;
                }
                break;
            case 2:
                System.out.println("===== Cong cu chinh sua =====");
                System.out.println("1. Loc theo nha san xuat");
                System.out.println("2. Sap xep theo ngay san xuat");
                System.out.println("3. Loc theo gia");
                System.out.println("4. Sap xep theo gia");
                System.out.print("Moi nhap lua chon: ");
                caseTool = input.nextInt();
                switch (caseTool) {
                    case 1:
                        System.out.println("1. Loc theo nha san xuat");
                        pm.SortByManufacturer();
                        break;
                    case 2:
                        System.out.println("2. Sap xep theo ngay san xuat");
                        break;
                    case 3:
                        System.out.println("3. Loc theo gia");
                        break;
                    case 4:
                        System.out.println("4. Sap xep theo gia");
                        break;
                }
                break;
            case 0:
                System.out.println("Thoat chuong trinh");
//                exit = true;
                break;
        }
//        if (exit) {
//            break;
//        }
    }
}

