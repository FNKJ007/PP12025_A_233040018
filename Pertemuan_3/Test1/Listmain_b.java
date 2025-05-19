package Pertemuan_3.Test1;
import Pertemuan_3.latihan2dan3.StrukturList;

public class Listmain_b {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.AddTail(1);
        list.AddTail(4);
        list.AddTail(5);
        list.AddTail(1);



        System.out.println("Element:");
        list.displayElement();
    }

}
