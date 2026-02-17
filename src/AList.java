public class AList {
    public song[] array;
    public int size;

    public AList() {
        array = new song[10];
        size = 0;
    }

    public void addy(song s) {
        if (size == array.length) {
            song[] newArray = new song[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = s;
        size++;
    }

    public void removy(int pos) {
        if (pos < 0 || pos >= size) {
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public String toString() {

        if (size == 0) {
            return "Empty List";
        }

        String result = "";

        for (int i = 0; i < size; i++) {
            result = result + array[i];
            if (i < size - 1) {
                result = result + "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        AList list = new AList();
        song s1 = new song("song A", "Artist A", 3.5);
        song s2 = new song("song B", "Artist B", 4.2);

        list.addy(s1);
        list.addy(s2);
        System.out.println("AList after adding:");
        System.out.println(list.toString());

        list.removy(0);
        System.out.println("\nAList after removing index 0:");
        System.out.println(list.toString());
    }
}