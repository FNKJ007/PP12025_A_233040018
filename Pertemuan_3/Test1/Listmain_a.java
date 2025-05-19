package Pertemuan_3.Test1;
import Pertemuan_3.latihan2dan3.StrukturList;

public class Listmain_a {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.AddTail(3);
        list.AddTail(2);
        list.AddTail(1);


        System.out.println("Element:");
        list.displayElement();
    }

}
