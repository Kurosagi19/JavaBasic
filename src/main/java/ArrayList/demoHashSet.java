package ArrayList;

import java.util.HashSet;
import java.util.Set;

import OOP.Abstraction.Work0.*;

public class demoHashSet {
    public static void main(String[] args) {
        HashSet hashSet1 = new HashSet();
        HashSet<String> hashSet2 = new HashSet<String>();
        HashSet hashSet3 = new HashSet(20);
        HashSet<Integer> hashSet4 = new HashSet<Integer>(30);
        HashSet<hinhChuNhat> hashSetObj = new HashSet<hinhChuNhat>();
        Set<String> hashSet5 = new HashSet<String>();
//        Them du lieu vao Set
        hashSet2.add("PHP");
        hashSet2.add("Java");
        hashSet2.add("Python");
        hashSet2.add("JS");
//        Hien thi cac phan tu trong Set
        System.out.println(hashSet2);
//         Hien thi lan luot cac phan tu trong Set
        for (String programming : hashSet2) {
            System.out.println(programming);
        }
//       Tim kiem phan tu co ton tai trong Set khong
        System.out.println(hashSet2.contains("PHP"));
//        Xoa phan tu trong Set
        hashSet2.remove("JS");
//        Xoa tat ca phan tu
        hashSet2.clear();

        hashSetObj.add(new hinhChuNhat(8, 7));
        for (hinhChuNhat hcn : hashSetObj) {
            System.out.println(hcn.chieuDai);
        }
    }
}
