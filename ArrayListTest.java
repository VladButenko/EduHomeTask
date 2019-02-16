package com.company;

public class ArrayListTest {

    public static void main(String[] args) {
        TesterCollection w = new TesterCollection();
        ICollection arr = new ArrList();
        try {
            w.testCollection(arr);
        } catch (FunnyException e) {
            e.printStackTrace();
        }
    }
}
