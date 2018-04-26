package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListManager<T extends Number & Comparable> {

    List<T> list = new ArrayList<>();

    public void addElement(T elem) {
        this.list.add(elem);
    }

    public void removeLast() {
        if (!this.list.isEmpty()) this.list.remove(this.list.size() - 1);
    }

    public void sorted() {
        this.list = (List<T>) list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public void printList() {
        for (T aList : list) System.out.println(aList);
    }
}
