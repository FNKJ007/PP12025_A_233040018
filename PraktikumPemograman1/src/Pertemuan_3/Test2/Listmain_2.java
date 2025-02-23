package Pertemuan_3.Test2;

import Pertemuan_3.latihan5.AddHead;

public class Listmain_2 {
    public static void main(String[] args) {
        AddHead list = new AddHead();
        list.addHead(3);
        list.addHead(4);
        list.addHead(5);


        System.out.println("Element:");
        list.display();
    }
}
