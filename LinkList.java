package com.company;

public class LinkList<T> implements ICollection<T> {
    private Node first;
    private Node last;
    private int index = 0;

    @Override
    public void add(T item){
        Node node = new Node(item);
        index++;
        if (first == null){
            first = node;
            last = node;
        }else {
            last.next = node;
            last = node;
        }

        first.next = node;
        last = node;

    }


    private class Node<T> {
        T t;
        Node next;

        public Node(T t) {
            this.t = t;
        }
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public boolean contains(T s){

        Node current = first;

        while (current != null){
            if (current.equals(s)){
                return true;
            }
            current = current.next;
        }
        return false;
    }


}
