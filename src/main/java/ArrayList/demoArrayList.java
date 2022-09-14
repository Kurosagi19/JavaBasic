package ArrayList;

import java.util.ArrayList;

import OOP.Abstraction.Work0.*;

public class demoArrayList {
    public static void main(String[] args) {
        // Tao ArrayList
        ArrayList arrayList1 = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList arrayList3 = new ArrayList(20);
        ArrayList<Integer> arrayList4 = new ArrayList<Integer>(30);
        ArrayList<hinhChuNhat> arrayListObj = new ArrayList<hinhChuNhat>();
        // Them phan tu vao cuoi ArrayList
        arrayList1.add("PHP");
        arrayList1.add(1);
        arrayList1.add(new hinhChuNhat(6, 5));
        arrayList2.add("PHP");
        arrayList2.add("JS");
        // Them phan tu vao vi tri Index duoc chi dinh
        arrayList1.add(1, "Python");
        // Hien thi toan bo ArrayList
        System.out.println(arrayList1);
        // Hien thi lan luot cac phan tu
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        for (String programmingLanguage : arrayList2) {
            System.out.println(programmingLanguage);
        }
        // Update gia tri phan tu
        arrayList2.set(1, "Ruby");
        System.out.println(arrayList2);
        // Tim kiem 1 phan tu co ton tai trong ArrayList khong
        System.out.println(arrayList2.contains("PHP"));
        // Them toan bo phan tu cua ArrayList nay vao ArrayList khac
        arrayList3.addAll(arrayList2);
        // Tao ban sao cua ArrayList
        arrayList3.clone();
        // Xoa 1 phan tu cua ArrayList
        arrayList2.remove("Ruby");
        arrayList2.remove(0);
        // Xoa tat ca phan tu cua ArrayList
        arrayList2.clear();
        // Lay gia tri
        System.out.println(arrayListObj.get(0).chieuDai);
    }
}
