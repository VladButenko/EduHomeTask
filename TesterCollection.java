package com.company;

public class  TesterCollection {

    public void testCollection(ICollection<String> list) {
        list.add("Nuka cola");
        list.add("orange");
        list.add("pocket");
        list.add("wallet");
        list.add("potato");
        list.add("book");
        list.add("mood");
        list.add("orange");
        list.add("pocket");
        list.add("wallet");
        list.add("potato");
        list.add("book");
        list.add("mood");

        if (list.contains("")) {
            System.out.println("Item in the bag");
        } else  {
            System.out.println("Can't find this item");
        }

        System.out.println(list.getIndex());
    }
}
