package Pertemuan_3.latihan2dan3;

import Pertemuan_3.latihan1.Node;


public class StrukturList {
    private Node HEAD;
    public void AddTail(int data){
        Node posNode=null, cureNode=null;
        Node newNode=new Node(data);
        if (HEAD==null)
        {
            HEAD = newNode;
        }
        else
        {
            cureNode=HEAD;
            while (cureNode != null)
            {
                posNode=cureNode;
                cureNode=cureNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

        public void displayElement() {

            Node curNode = HEAD;
            while (curNode != null) {
                System.out.print(curNode.getData()+"");
                curNode=curNode.getNext();
            }
        }

}

