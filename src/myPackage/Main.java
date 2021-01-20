package myPackage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);

        // Khai bao list;
        List<Person> listPerson = new ArrayList<Person>();

        // Them phan tu;
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);
        listPerson.add(person3);

        // Goi Ham trong phan tu;
        Person p = listPerson.get(0);
        System.out.println(p.getId());
// Cach 1: truy xuat Ham cua tung phan tu;
        for (Person person : listPerson) {
            System.out.println(person.getId());
        }

        // Cach 2:  Dung Ham size() truy xuat Ham tung phan tu;
        for (int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i).getId());
        }

        // Xoa phan tu trong list;remove(i);
        listPerson.remove(3);
        for (Person person : listPerson) {
            System.out.println(person.getId());
        }
        listPerson.remove(person1);
        for (Person person : listPerson) {
            System.out.println(person.getId());
        }
        System.out.println("---");

        // new la Obj moi, ko phai Obj da bi xoa;
        // neu Override Ham equal thi se xoa duoc Obj moi;
        listPerson.remove(new Person(2));
        for (Person person : listPerson) {
            System.out.println(person.getId());
        }
    }
}
// list lam viec voi Obj doc lap trong Array;
// ko nen dung de them, sua, xoa;