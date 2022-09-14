package AssignmentPhones;

import java.io.Serializable;

public class Phone implements Serializable {
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

    public Phone() {

    }

    public Phone(String phoneName, String manufacturer, String phoneIMEI, double price, String releaseDate, double RAM, double ROM, String chip, String screenSize, String phoneSize) {
        super();
        this.phoneName = phoneName;
        this.manufacturer = manufacturer;
        this.phoneIMEI = phoneIMEI;
        this.price = price;
        this.releaseDate = releaseDate;
        this.RAM = RAM;
        this.ROM = ROM;
        this.chip = chip;
        this.screenSize = screenSize;
        this.phoneSize = phoneSize;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String s) {
        this.phoneName = phoneName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPhoneIMEI() {
        return phoneIMEI;
    }

    public void setPhoneIMEI(String phoneIMEI) {
        this.phoneIMEI = phoneIMEI;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate() {
        this.releaseDate = releaseDate;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public double getROM() {
        return ROM;
    }

    public void setROM(double ROM) {
        this.ROM = ROM;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getPhoneSize() {
        return phoneSize;
    }

    public void setPhoneSize(String phoneSize) {
        this.phoneSize = phoneSize;
    }


}
