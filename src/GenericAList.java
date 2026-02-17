public class GenericAList<T> {
    public Object[] array;
    public int size;

    public GenericAList() {
        array = new Object[10];
        size = 0;
    }

    public void addy(T s) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
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
}