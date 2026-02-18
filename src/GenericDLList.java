public class GenericDLList<T> {

    public class DLNode {
        T data;
        DLNode next;
        DLNode prev;

        public DLNode(T d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public DLNode head;

    public GenericDLList() {
        head = null;
    }

    public void addy(T s) {

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

}