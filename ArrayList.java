public class ArrayList<T> {
    private Object[] elements;
    private int size;
    private int capacity;
    

    public ArrayList() {
        capacity = 10;  // initial capacity
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == capacity) {
            // double the capacity if the array is full
            capacity *= 2;
            Object[] newElements = new Object[capacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[capacity];
        size = 0;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public Patients remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return null;
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public String getData() {
        return null;
    }
}
