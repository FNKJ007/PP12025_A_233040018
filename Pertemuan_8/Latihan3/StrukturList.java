package Pertemuan_8.Latihan3;
import Pertemuan_8.Node;

public class StrukturList {
    Node HEAD;
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
}
