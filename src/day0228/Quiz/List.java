package day0228.Quiz;

public interface List<T> {
    void add(T data);
    T remove(int index);
    T get(int index);
}