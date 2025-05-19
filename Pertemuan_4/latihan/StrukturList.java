package Pertemuan_4.latihan;

class StrukturList {
    Node head;

    // Konstruktor untuk inisialisasi linked list kosong
    public StrukturList() {
        this.head = null;
    }

    // Fungsi untuk menambahkan node di posisi tengah/middle
    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        // Jika linked list masih kosong
        if (head == null) {
            head = newNode;
            return;
        }

        // Jika posisi yang dimasukkan adalah 1, tambahkan di awal
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curNode = head;
        Node prevNode = null;
        int i = 1;

        // Loop untuk mencapai posisi yang diinginkan
        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        // Menyisipkan node baru di posisi yang sesuai
        prevNode.next = newNode;
        newNode.next = curNode;
    }

    // Fungsi untuk menampilkan elemen-elemen dalam linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}