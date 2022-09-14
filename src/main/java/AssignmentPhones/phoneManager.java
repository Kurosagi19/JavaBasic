package AssignmentPhones;

import java.io.FileNotFoundException;
import java.io.NotSerializableException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class phoneManager extends Phone {
    public static Scanner input = new Scanner(System.in);
    public String phoneName;
    public String manufacturer;
    public String phoneIMEI;
    public double price;
    public String releaseDate;
    public double RAM;
    public double ROM;
    public String chip;
    public String screenSize;
    public String phoneSize;
    public static List<phoneManager> phonesList;
    public phoneFile PhoneFile;

    public phoneManager() {
        PhoneFile = new phoneFile();
        phonesList = PhoneFile.read();
    }

    //    Them dien thoai
    public void phoneAdd() throws FileNotFoundException, NotSerializableException {
        int listAdd = (phonesList.size() > 0) ? (phonesList.size() + 1) : 1;
        System.out.println("So thiet bi can nhap: ");
        listAdd = input.nextInt();
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


    private String inputPhoneName() {
        System.out.print("Nhap ten thiet bi: ");
        phoneName = input.nextLine();
        return input.nextLine();
    }

    private String inputManufacturer() {
        System.out.print("Nha phat hanh: ");
        return input.nextLine();
    }

    private String inputPhoneIMEI() {
        System.out.print("IMEI: ");
        return input.nextLine();
    }

    private double inputPrice() {
        System.out.print("Nhap gia ban: ");
        return input.nextDouble();
    }

    private String inputReleaseDate() {
        System.out.print("Ngay phat hanh: ");
        releaseDate = input.nextLine();
        return input.nextLine();
    }

    private double inputRAM() {
        System.out.print("Nhap RAM: ");
        return input.nextDouble();
    }

    private double inputROM() {
        System.out.print("Nhap ROM: ");
        return input.nextDouble();
    }

    private String inputChip() {
        System.out.print("Nhap ten chip: ");
        chip = input.nextLine();
        return input.nextLine();
    }

    private String inputPhoneSize() {
        System.out.print("Kich thuoc thiet bi: ");
        return input.nextLine();
    }

    private String inputScreenSize() {
        System.out.print("Kich thuoc man hinh: ");
        return input.nextLine();
    }

    //    Cap nhat dien thoai
    public void phoneUpdate() throws FileNotFoundException, NotSerializableException {
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
    public void phoneDelete() throws FileNotFoundException, NotSerializableException {
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


