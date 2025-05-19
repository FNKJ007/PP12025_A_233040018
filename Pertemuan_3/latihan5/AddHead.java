package Pertemuan_3.latihan5;


import Pertemuan_3.latihan1.Node;


public class AddHead {
    private Node HEAD;
    public AddHead() {
        this.HEAD = null;
    }
    public void addHead(int data){

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void display() {

        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+"");
            curNode=curNode.getNext();
        }
    }
}
