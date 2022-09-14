package AssignmentPhones;

import java.util.Comparator;

public class sortByManufacturer implements Comparator<Phone> {

    @Override
    public int compare(Phone p1, Phone p2) {
        return p1.getManufacturer().compareTo(p2.getManufacturer());
    }
}

