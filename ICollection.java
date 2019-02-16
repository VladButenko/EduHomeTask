package com.company;

public interface ICollection<T> {

    int getIndex();
    void add(T item);
    boolean contains(T s);
}
