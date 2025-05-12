package Pertemuan_8.Latihan4;
import Pertemuan_8.Latihan1.Matakuliah;
import Pertemuan_8.Node;
public class ListMKTest {
    Node HEAD;
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }


    public void displayElement(){
        if (isEmpty()){
            System.out.println("List kosong");
        }
        else {
            Node curNode = HEAD;
            while (curNode !=null) {
                System.out.println(curNode.getData().getKode()+" "+curNode.getData().getNama()+" "+curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }
    public boolean isEmpty() {
        return (HEAD == null);
    }
    public static void main(String[] args) {
        ListMKTest list = new ListMKTest();

        list.addHead(new Matakuliah("IF001", "dasar pemogrman", 4));
        list.addHead(new Matakuliah("IF002", "pemogrmana web", 3));
        list.displayElement();
    }
}
