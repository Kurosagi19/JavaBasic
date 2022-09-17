package Phone;

import java.util.Scanner;

import static Phone.main.menuPhone;

public class Phones {
    static Phones[] arr = new Phones[1000];
    static int a = 0;
    public int IMEI;
    public String name;
    public String manufacturer;
    public int price;
    public int day;
    public int month;
    public int year;
    public int RAM;
    public int ROM;
    public String chip;
    public float Screen;
    public double phWidth;
    public double phLength;
    public double phThickness;


    public static void add(){
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong dt muon them: ");
        count = input.nextInt();
        for(int i = 0; i < count; i++){
            Phones phone = new Phones();
            System.out.println("============ DIEN THOAI THU " + (i+1) + " ============");
            System.out.print("Ten dien thoai: ");
            input.nextLine();
            phone.name = input.nextLine();
            System.out.print("IMEI: ");
            phone.IMEI = input.nextInt();
            if(a > 0){
                for(int j = 0; j < a; j++){
                    while(phone.IMEI == arr[j].IMEI){
                        System.out.println("IMEI da ton tai, moi nhap lai: ");
                        phone.IMEI = input.nextInt();
                    }
                }
            }
            System.out.print("Nha san xuat: ");
            input.nextLine();
            phone.manufacturer = input.nextLine();
            System.out.println("Ngay san xuat: ");
            System.out.print("Ngay: ");
            phone.day = input.nextInt();
            System.out.print("Thang: ");
            phone.month = input.nextInt();
            System.out.print("Nam: ");
            phone.year = input.nextInt();
            System.out.print("Chip: ");
            input.nextLine();
            phone.chip = input.nextLine();
            System.out.print("Gia: ");
            phone.price = input.nextInt();
            System.out.print("RAM: ");
            phone.RAM = input.nextInt();
            System.out.print("ROM: ");
            phone.ROM = input.nextInt();
            System.out.print("Kich co man hinh: ");
            phone.Screen = input.nextInt();
            System.out.println("Kich co dien thoai: ");
            System.out.print("Chieu dai: ");
            phone.phLength = input.nextInt();
            System.out.print("Chieu rong: ");
            phone.phWidth = input.nextInt();
            System.out.print("Do day: ");
            phone.phThickness = input.nextInt();
            arr[a] = phone;
            a++;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("Them hoan tat " + count + " DT.");
        main.menuPhone();
    }

    public static void display(){
        System.out.println("~~~~~~~~~~ DANH SACH THIET BI HIEN CO ~~~~~~~~~~");
        for (int count = 0; count < a; count++){
            System.out.println("DIEN THOAI THU " + (count + 1) + ": ");
            System.out.println("Ten dien thoai: " + arr[count].name);
            System.out.println("IMEI: " + arr[count].IMEI);
            System.out.println("Nha san xuat: " + arr[count].manufacturer);
            System.out.println("Ngay san xuat: " + arr[count].day + "/" + arr[count].month + "/" + arr[count].year);
            System.out.println("RAM: " + arr[count].RAM);
            System.out.println("ROM: " + arr[count].ROM);
            System.out.println("Chip: " + arr[count].chip);
            System.out.println("Gia: " + arr[count].price);
            System.out.println("Kich co man hinh: " + arr[count].Screen);
            System.out.println("Chieu dai dien thoai: " + arr[count].phLength);
            System.out.println("Do rong dien thoai: " + arr[count].phWidth);
            System.out.println("Do day dien thoai: " + arr[count].phThickness);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public static void fix(){
        int search;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~ CHINH SUA THONG TIN THIET BI ~~~~~~~~~~");
        System.out.print("Nhap IMEI cua DT muon sua: ");
        search = input.nextInt();
        for(int count = 0; count < a; count++){
            if(search == arr[count].IMEI){
                System.out.println("Chon thong tin muon sua: ");
                System.out.println("1. Ten dien thoai");
                System.out.println("2. IMEI");
                System.out.println("3. Nha san xuat");
                System.out.println("4. Ngay san xuat");
                System.out.println("5. RAM");
                System.out.println("6. ROM");
                System.out.println("7. Chip");
                System.out.println("8. Gia");
                System.out.println("9. Kich co man hinh");
                System.out.println("10. Kich co dien thoai");
                System.out.println("0. Tro lai menu");
                System.out.print("Chon: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:{
                        fixName(count);
                        break;
                    }
                    case 2:{
                        fixIMEI(count);
                        break;
                    }
                    case 3:{
                        fixManufacturer(count);
                        break;
                    }
                    case 4:{
                        fixDate(count);
                        break;
                    }
                    case 5:{
                        fixRAM(count);
                        break;
                    }
                    case 6:{
                        fixROM(count);
                        break;
                    }
                    case 7:{
                        fixChip(count);
                        break;
                    }
                    case 8:{
                        fixPrice(count);
                        break;
                    }
                    case 9:{
                        fixScrS(count);
                        break;
                    }
                    case 10:{
                        fixPhS(count);
                        break;
                    }
                    case 0:{
                        main.menuPhone();
                        break;
                    }
                    default:{
                        System.out.println("So da nhap khong hop le");
                        System.out.println("Vui long nhap lai");
                        fix();
                    }
                }
            }
        }
        main.menuPhone();
    }

    public static void fixIMEI(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("IMEI: ");
        arr[count].IMEI = input.nextInt();
    }

        public static void fixManufacturer(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("Nha san xuat: ");
        arr[count].manufacturer = input.nextLine();
    }

    public static void fixDate(int count){
        Scanner input = new Scanner(System.in);
        System.out.println("Ngay san xuat: ");
        System.out.print("Ngay:");
        arr[count].day = input.nextInt();
        System.out.print("Thang: ");
        arr[count].month = input.nextInt();
        System.out.print("Nam: ");
        arr[count].year = input.nextInt();
    }

    public static void fixRAM(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("RAM: ");
        arr[count].RAM = input.nextInt();
    }

    public static void fixROM(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("ROM: ");
        arr[count].ROM = input.nextInt();
    }

    public static void fixChip(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("Chip: ");
        arr[count].chip = input.nextLine();
    }

    public static void fixPrice(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("Gia: ");
        arr[count].price = input.nextInt();
    }

    public static void fixScrS(int count){
        Scanner input = new Scanner(System.in);
        System.out.println("Kich co man hinh: ");
        arr[count].Screen = input.nextInt();
    }

    public static void fixName(int count){
        Scanner input = new Scanner(System.in);
        System.out.print("Ten dien thoai: ");
        arr[count].name = input.nextLine();
    }

    public static void fixPhS(int count){
        Scanner input = new Scanner(System.in);
        System.out.println("Kich co dien thoai: ");
        System.out.print("CHieu dai: ");
        arr[count].phLength = input.nextInt();
        System.out.print("Chieu rong: ");
        arr[count].phWidth = input.nextInt();
        System.out.print("Do day: ");
        arr[count].phThickness = input.nextInt();
    }

    public static void del(){
        int num;
        int del;
        Scanner input = new Scanner(System.in);
        System.out.println("_____________ XOA THIET BI _____________");
        System.out.print("Nhap so luong dien thoai muon xoa: ");
        num = input.nextInt();
        for (int count = 0; count < num; count++){
            System.out.print("Nhap IMEI dien thoai muon xoa: ");
            del = input.nextInt();
            for(int x = 0; x < a; x++){
                if(del == arr[x].IMEI){
                    for (int y = x ; y < a; y++){
                        arr[y] = arr[y+1];
                    }
                    a--;
                }
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void sortPriceH2L() {
        Phones p = new Phones();
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[j].price > arr[i].price) {
                    p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
        for (int count = 0; count < a; count++) {
            System.out.println("Ten dien thoai: " + arr[count].name);
            System.out.println("IMEI: " + arr[count].IMEI);
            System.out.println("Nha san xuat: " + arr[count].manufacturer);
            System.out.println("Ngay san xuat: " + arr[count].day + "/" + arr[count].month + "/" + arr[count].year);
            System.out.println("RAM: " + arr[count].RAM);
            System.out.println("ROM: " + arr[count].ROM);
            System.out.println("Chip: " + arr[count].chip);
            System.out.println("Gia: " + arr[count].price);
            System.out.println("Kich co man hinh: " + arr[count].Screen);
            System.out.println("Chieu dai dien thoai: " + arr[count].phLength);
            System.out.println("Do rong dien thoai: " + arr[count].phWidth);
            System.out.println("Do day dien thoai: " + arr[count].phThickness);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        main.menuTool();
    }

    public static void sort() {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Lua chon thu tu muon sap xep:");
        System.out.println("1. Thap den cao");
        System.out.println("2. Cao den thap");
        System.out.println("0. Quay tro lai menu");
        System.out.print("Chon: ");
        choice = input.nextInt();
        switch (choice){
            case 1: sortPriceL2H();
            case 2: sortPriceH2L();
            case 0: main.menuTool();
            default: {
                System.out.println("So da nhap khong hop le");
                System.out.println("Vui long nhap lai");
                sort();
            }
        }
        sort();
    }

    public static void sortPriceL2H() {
        Phones p = new Phones();
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[j].price < arr[i].price) {
                    p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
        for (int count = 0; count < a; count++) {
            System.out.println("Ten dien thoai: " + arr[count].name);
            System.out.println("IMEI: " + arr[count].IMEI);
            System.out.println("Nha san xuat: " + arr[count].manufacturer);
            System.out.println("Ngay san xuat: " + arr[count].day + "/" + arr[count].month + "/" + arr[count].year);
            System.out.println("RAM: " + arr[count].RAM);
            System.out.println("ROM: " + arr[count].ROM);
            System.out.println("Chip: " + arr[count].chip);
            System.out.println("Gia: " + arr[count].price);
            System.out.println("Kich co man hinh: " + arr[count].Screen);
            System.out.println("Chieu dai dien thoai: " + arr[count].phLength);
            System.out.println("Do rong dien thoai: " + arr[count].phWidth);
            System.out.println("Do day dien thoai: " + arr[count].phThickness);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        main.menuTool();
    }

    public static void filterPrice() {
        int pr;
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tien: ");
        pr = input.nextInt();
        for (count = 0; count < a; count++){
                if(pr == arr[count].price){
                    System.out.println("Ten dien thoai: " + arr[count].name);
                    System.out.println("IMEI: " + arr[count].IMEI);
                    System.out.println("Nha san xuat: " + arr[count].manufacturer);
                    System.out.println("Ngay san xuat: " + arr[count].day + "/" + arr[count].month + "/" + arr[count].year);
                    System.out.println("RAM: " + arr[count].RAM);
                    System.out.println("ROM: " + arr[count].ROM);
                    System.out.println("Chip: " + arr[count].chip);
                    System.out.println("Gia: " + arr[count].price);
                    System.out.println("Kich co man hinh: " + arr[count].Screen);
                    System.out.println("Chieu dai dien thoai: " + arr[count].phLength);
                    System.out.println("Do rong dien thoai: " + arr[count].phWidth);
                    System.out.println("Do day dien thoai: " + arr[count].phThickness);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
        }
    }

    public static void sortDate() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("===== DANH SACH DIEN THOAI SAP XEP THEO NGAY SAN XUAT =====");
        System.out.println("Lua chon thu tu muon sap xep:");
        System.out.println("1. Cu nhat den moi nhat");
        System.out.println("2. Moi nhat den cu nhat");
        System.out.println("0. Quay tro lai menu");
        System.out.print("Chon: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                sortDateL2H();
                break;
            case 2:
                sortDateH2L();
                break;
            case 0:
                main.menuTool();
                break;
            default: {
                System.out.println("So da nhap khong hop le");
                System.out.println("Vui long nhap lai");
                sortDate();
                break;
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void sortDateL2H() {
        Phones p = new Phones();
        for (int y1 = 0; y1 < a - 1; y1++) {
            for (int y2 = y1 + 1; y2 < a; y2++) {
                if (arr[y2].year < arr[y1].year) {
                    for (int m1 = 0; m1 < a - 1; m1++) {
                        for (int m2 = m1 + 1; m2 < a; m2++) {
                            if (arr[m2].month < arr[m1].month) {
                                for (int d1 = 0; d1 < a - 1; d1++) {
                                    for (int d2 = d1 + 1; d2 < a; d2++) {
                                        if (arr[d2].day < arr[d1].day) {
                                            p = arr[d2];
                                            arr[d2] = arr[d1];
                                            arr[d1] = p;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println("Ten dien thoai: " + arr[i].name);
            System.out.println("IMEI: " + arr[i].IMEI);
            System.out.println("Nha san xuat: " + arr[i].manufacturer);
            System.out.println("Ngay san xuat: " + arr[i].day + "/" + arr[i].month + "/" + arr[i].year);
            System.out.println("RAM: " + arr[i].RAM);
            System.out.println("ROM: " + arr[i].ROM);
            System.out.println("Chip: " + arr[i].chip);
            System.out.println("Gia: " + arr[i].price);
            System.out.println("Kich co man hinh: " + arr[i].Screen);
            System.out.println("Chieu dai dien thoai: " + arr[i].phLength);
            System.out.println("Do rong dien thoai: " + arr[i].phWidth);
            System.out.println("Do day dien thoai: " + arr[i].phThickness);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public static void sortDateH2L() {
        Phones p = new Phones();
        for (int y1 = 0; y1 < a - 1; y1++) {
            for (int y2 = y1 + 1; y2 < a; y2++) {
                if (arr[y2].year > arr[y1].year) {
                    for (int m1 = 0; m1 < a - 1; m1++) {
                        for (int m2 = m1 + 1; m2 < a; m2++) {
                            if (arr[m2].month > arr[m1].month) {
                                for (int d1 = 0; d1 < a - 1; d1++) {
                                    for (int d2 = d1 + 1; d2 < a; d2++) {
                                        if (arr[d2].day > arr[d1].day) {
                                            p = arr[d1];
                                            arr[d1] = arr[d2];
                                            arr[d2] = p;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println("Ten dien thoai: " + arr[i].name);
            System.out.println("IMEI: " + arr[i].IMEI);
            System.out.println("Nha san xuat: " + arr[i].manufacturer);
            System.out.println("Ngay san xuat: " + arr[i].day + "/" + arr[i].month + "/" + arr[i].year);
            System.out.println("RAM: " + arr[i].RAM);
            System.out.println("ROM: " + arr[i].ROM);
            System.out.println("Chip: " + arr[i].chip);
            System.out.println("Gia: " + arr[i].price);
            System.out.println("Kich co man hinh: " + arr[i].Screen);
            System.out.println("Chieu dai dien thoai: " + arr[i].phLength);
            System.out.println("Do rong dien thoai: " + arr[i].phWidth);
            System.out.println("Do day dien thoai: " + arr[i].phThickness);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static void filterManu() {
        String manu;
        int count;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap Nha san xuat: ");
        manu = input.nextLine();
        for (count = 0; count < a; count++){
            if(manu.equals(arr[count].manufacturer)){
                System.out.println("Ten dien thoai: " + arr[count].name);
                System.out.println("IMEI: " + arr[count].IMEI);
                System.out.println("Nha san xuat: " + arr[count].manufacturer);
                System.out.println("Ngay san xuat: " + arr[count].day + "/" + arr[count].month + "/" + arr[count].year);
                System.out.println("RAM: " + arr[count].RAM);
                System.out.println("ROM: " + arr[count].ROM);
                System.out.println("Chip: " + arr[count].chip);
                System.out.println("Gia: " + arr[count].price);
                System.out.println("Kich co man hinh: " + arr[count].Screen);
                System.out.println("Chieu dai dien thoai: " + arr[count].phLength);
                System.out.println("Do rong dien thoai: " + arr[count].phWidth);
                System.out.println("Do day dien thoai: " + arr[count].phThickness);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
