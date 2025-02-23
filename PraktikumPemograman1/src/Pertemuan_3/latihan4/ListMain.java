package Pertemuan_3.latihan4;

import Pertemuan_3.latihan2dan3.StrukturList;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.AddTail(1);
        list.AddTail(4);
        list.AddTail(5);


        System.out.println("Element:");
        list.displayElement();
    }
}
