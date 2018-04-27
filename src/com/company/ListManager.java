package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListManager<T extends Number & Comparable> {

    List list;
    boolean isHaveInteger = false;

    public ListManager(T initialElement) {
        list = new ArrayList<>();
        list.add(initialElement);
    }

    public <N extends Number & Comparable> void addElement(N element) {

        if (element.getClass() == Double.class) {
            isHaveInteger = true;
        }

        if (list.get(list.size() - 1).getClass() == element.getClass())
            list.add(element);
        else {
            List<N> newList = new ArrayList<>();
            list.stream().forEach(o -> newList.add((N) o));
            newList.add(element);
            list = newList;
        }
    }

    public void removeLast() {
        //TODO: make func convertToInteger if last element Double and list don't have any Double element
        if (!this.list.isEmpty()) this.list.remove(this.list.size() - 1);
    }

    public void sort() {
        if (isHaveInteger) { this.convertToDouble(); }
        this.list = (List<T>) list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public void printList() {
        for (Object aList : list) System.out.println(aList);
    }

    private void convertToDouble() {

        List<Double> newList = new ArrayList<>();

        for (Object alist : list) {
            if (alist.getClass() == Double.class) { newList.add((Double)alist); }
            else { newList.add((new Double((Integer)alist))); }
        }

        this.list = newList;
    }
}



