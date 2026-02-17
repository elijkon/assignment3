public class DLList {

    public class DLNode {
        song data;
        DLNode next;
        DLNode prev;

        public DLNode(song d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public DLNode head;

    public DLList() {
        head = null;
    }

    public void addy(song s) {

        DLNode newNode = new DLNode(s);

        if (head == null) {
            head = newNode;
        }
        else {
            DLNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void removy(int pos) {
        if (head == null || pos < 0) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        DLNode temp = head;
        for (int i = 0; i < pos; i++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public String toString() {
        if (head == null) {
            return "Empty List";
        }

        String result = "";
        DLNode temp = head;

        while (temp != null) {
            result = result + temp.data;

            if (temp.next != null) {
                result = result + "\n";
            }
            temp = temp.next;
        }
        return result;
    }

    public static void main(String[] args) {
        song s1 = new song("Coral Crown", "Darren Korb", 4.07);
        song s2 = new song("CASANOVE POSSE", "ALI", 4.00);
        song s3 = new song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        DLList list = new DLList();

        list.addy(s1);
        list.addy(s2);
        list.addy(s3);

        System.out.println("Full List:");
        System.out.println(list.toString());

        list.removy(0);

        System.out.println("\nAfter removing index 0:");
        System.out.println(list.toString());
    }
}