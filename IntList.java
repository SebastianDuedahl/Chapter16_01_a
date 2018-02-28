package Chapter_16_a;

public interface IntList {
    int size();
    int get(int index);
    String toString();
    int indexOf(int value);
    void add(int value);
    void add(int index, int value);
    void remove(int index);
}
