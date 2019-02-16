package com.company;

public class ArrList<T> implements ICollection<T> {
    private T[] arr;
    private int index;

    public ArrList() {
        arr =  (T[]) new Object[10];
    }

    public ArrList(int length) {
        arr =  (T[]) new Object[length];
    }

    @Override
    public void add(T item) {
        if ( item == null)
            return;

        if (index >= arr.length) {
            resize();
        }
        arr[index] = (T) item;
        index++;
    }

    private void resize() {
        T[] temp = (T[]) new Object[arr.length * 3/2 + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            temp[i] = arr[j];
        }
        arr = temp;
    }

    public boolean contains(T s) {
        if (s == null){
            return false;
        }
        for (int i = 0; i < index; i++){
            if (s.equals(arr[i])){
                return true;
            }
        }
        return false;
    }


    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

    public int getIndex() {
        return index;
    }
}
