package Node;

public class Node {
    int data;
    Node next = null;

    Node(int d) {
        this.data = d;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = this;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }

    private static Node KthToLast(Node first, int k) {
        Node n = first;
        int total = 1;
        // 첫 번째 노드는 검색하지 않기 때문에 total이 1부터 시작
        while (n.next != null) {
            total++;
            n = n.next;
        }
        n = first;
        for (int i = 1; i < total - k + 1; i++) {
            n = n.next;
        }
        return n;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        System.out.println("");

        int k = 3;
        Node kth = KthToLast(head, k);
        System.out.println("Lst k(" + k + ")th data is " + kth.data);
    }

    // public static void main(String[] args) {
    // Node head = new Node(1);
    // head.append(2);
    // head.append(3);
    // head.append(4);
    // head.retrieve();
    // head.delete(2);
    // System.out.println("");
    // head.retrieve();

    // }

}