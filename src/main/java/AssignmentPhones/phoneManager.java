package AssignmentPhones;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class phoneManager extends Phone {
    public static Scanner input = new Scanner(System.in);
    public static String phoneName;
    public static String manufacturer;
    public static String phoneIMEI;
    public static double price;
    public static String releaseDate;
    public static double RAM;
    public static double ROM;
    public static String chip;
    public static String screenSize;
    public static String phoneSize;
    private static List<phoneManager> phonesList;
    private phoneFile PhoneFile;

    public phoneManager() {
        PhoneFile = new phoneFile();
        phonesList = PhoneFile.read();
    }

    //    Them dien thoai
    public static void phoneAdd() throws FileNotFoundException, NotSerializableException {
        int listAdd = (phonesList.size() > 0) ? (phonesList.size() + 1) : 1;
        System.out.println("Thiet bi thu: ");
        phoneName = inputPhoneName();
        manufacturer = inputManufacturer();
        phoneIMEI = inputPhoneIMEI();
        price = inputPrice();
        releaseDate = inputReleaseDate();
        RAM = inputRAM();
        ROM = inputROM();
        chip = inputChip();
        screenSize = inputScreenSize();
        phoneSize = inputPhoneSize();
        phoneManager p = new phoneManager();
        phonesList.add(p);
        phoneFile.write(phonesList);
    }


    private static String inputPhoneName() {
        System.out.print("Nhap ten thiet bi: ");
        return input.nextLine();
    }

    private static String inputManufacturer() {
        System.out.println("Nha phat hanh: ");
        return input.nextLine();
    }

    private static String inputPhoneIMEI() {
        System.out.println("IMEI: ");
        return input.nextLine();
    }

    private static double inputPrice() {
        System.out.println("Nhap gia ban: ");
        return input.nextDouble();
    }

    private static String inputReleaseDate() {
        System.out.println("Ngay phat hanh: ");
        return input.nextLine();
    }

    private static double inputRAM() {
        System.out.println("Nhap RAM: ");
        return input.nextDouble();
    }

    private static double inputROM() {
        System.out.println("Nhap ROM: ");
        return input.nextDouble();
    }

    private static String inputChip() {
        System.out.println("Nhap ten chip: ");
        return input.nextLine();
    }

    private static String inputPhoneSize() {
        System.out.println("Kich thuoc thiet bi: ");
        return input.nextLine();
    }

    private static String inputScreenSize() {
        System.out.println("Kich thuoc man hinh: ");
        return input.nextLine();
    }

    //    Cap nhat dien thoai
    public static void phoneUpdate() throws FileNotFoundException, NotSerializableException {
        boolean isExisted = false;
        double size = phonesList.size();
        for (int i = 0; i < size; i++) {
            if (phonesList.get(i).getPhoneIMEI() == phoneIMEI) {
                isExisted = true;
                phonesList.get(i).setPhoneName(inputPhoneName());
                phonesList.get(i).setPhoneIMEI(inputPhoneIMEI());
                phonesList.get(i).setChip(inputChip());
                phonesList.get(i).setManufacturer(inputManufacturer());
                phonesList.get(i).setPrice(inputPrice());
                phonesList.get(i).setManufacturer(inputManufacturer());
                phonesList.get(i).setRAM(inputRAM());
                phonesList.get(i).setROM(inputROM());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("IMEI = %d khong ton tai \n", phoneIMEI);
        } else {
            phoneFile.write(phonesList);
        }
    }

    //    Xoa dien thoai
    public static void phoneDelete() throws FileNotFoundException, NotSerializableException {
        Phone p1 = null;
        int size = phonesList.size();
        for (int i = 0; i < size; i++) {
            if (phonesList.get(i).getPhoneIMEI() == phoneIMEI) {
                p1 = phonesList.get(i);
                break;
            }
        }
        if (p1 != null) {
            phonesList.remove(p1);
            phoneFile.write(phonesList);
        } else {
            System.out.printf("IMEI = %d khong ton tai \n", phoneIMEI);
        }
    }

    public void SortByManufacturer() {
        Collections.sort(phonesList, new sortByManufacturer());
    }


    public List<phoneManager> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(List<phoneManager> phonesList) {
        this.phonesList = phonesList;
    }
}


