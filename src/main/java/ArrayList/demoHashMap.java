package ArrayList;

import OOP.Abstraction.Work0.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class demoHashMap {
    public static void main(String[] args) {
//        Tao HashMap
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>(20);
        HashMap<String, hinhChuNhat> hashMapObj = new HashMap<String, hinhChuNhat>();
//        Them phan tu vao HashMap
        hashMap1.put("conMeo", "Meo meo");
        hashMap1.put("conCho", "Gau gau");
        hashMap1.put("conGa", "Non");
//        Update phan tu trong HashMap
        hashMap1.put("conCho", "Ang ang");
//        Hien thi toan bo HashMap
        System.out.println(hashMap1);
//        Hien thi lan luot cac phan tu trong Map
//              Lay toan bo Key cua HashMap
        Set<String> keyHashMap = new HashSet<String>();
        keyHashMap = hashMap1.keySet();
        System.out.println(keyHashMap);
        for (String key : keyHashMap) {
            System.out.println(key + " => " + hashMap1.get(key));
        }
/*        Tuong tu List va Set, Map cung co mot so phuong thuc
            Tim kiem phan tu trong Map:
                Tim kiem Key: containsKey()
                Tim kiem theo Value: containsValue()
            Xoa phan tu:
                Xoa tung phan tu: remove(Key)
                Xoa toan bo: clear()
*/    }
}
