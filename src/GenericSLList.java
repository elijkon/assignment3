public class GenericSLList<T> {

    public class SLNode {
        T data;
        SLNode next;

        public SLNode(T d) {
            data = d;
            next = null;
        }
    }

    public SLNode head;

    public GenericSLList() {
        head = null;
    }

    public void addy(T s) {
        SLNode newNode = new SLNode(s);

        if (head == null) {
            head = newNode;
        }
        else {
            SLNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int pos) {

        if (head == null || pos < 0) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        SLNode temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp.next == null) {
                return;
            }
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public String toString() {
        if (head == null) {
            return "Empty List";
        }

        String result = "";
        SLNode temp = head;
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