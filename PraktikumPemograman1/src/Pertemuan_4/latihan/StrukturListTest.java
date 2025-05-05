package Pertemuan_4.latihan;

public class StrukturListTest {

        Node head;

        // Menambahkan node di akhir list (tail)
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Menambahkan node di awal list (head)
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Menambahkan node di posisi tertentu (middle)
        public void addMid(int data, int position) {
            Node newNode = new Node(data);
            if (position == 1 || head == null) {
                addFirst(data);
                return;
            }

            Node curNode = head;
            Node prevNode = null;
            int i = 1;

            while (curNode != null && i < position) {
                prevNode = curNode;
                curNode = curNode.next;
                i++;
            }

            prevNode.next = newNode;
            newNode.next = curNode;
        }

        // Menampilkan elemen dalam linked list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addMid(10, 1); // Menambahkan 10 di posisi pertama
        list.addMid(20, 2); // Menambahkan 20 di posisi kedua
        list.addMid(30, 2); // Menyisipkan 30 di posisi kedua

        list.printList(); // Output: 10 -> 30 -> 20 -> null}
    }
}
