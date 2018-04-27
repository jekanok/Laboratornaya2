package com.company;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListManager<T extends Number & Comparable> {

    List list;

    boolean isHaveDouble = false;
    private int countOfDouble = 0;

    public ListManager(T initialElement) {
        list = new ArrayList<>();
        list.add(initialElement);
    }

    public <N extends Number & Comparable> void addElement(N element) {

        if (element.getClass() == Double.class) {
            isHaveDouble = true;
            this.countOfDouble++;
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
        if (!this.list.isEmpty()) {

            if (this.list.get(this.list.size() - 1) instanceof Double) {
                this.countOfDouble--;
            }

            this.list.remove(this.list.size() - 1);
            if (this.countOfDouble == 0) { this.convertToInteger(); }
        }
    }

    //MARK: Converters

    private void convertToDouble() {

        List<Double> newList = new ArrayList<>();

        for (Object alist : list) {
            if (alist instanceof Double) { newList.add((Double)alist); }
            else { newList.add((new Double((Integer)alist))); }
        }

        this.list = newList;
    }

    private void convertToInteger() {

        List<Integer> newList = new ArrayList<>();

        for (Object aList : list) {
            if (aList instanceof Integer) { newList.add(((Integer) aList)); }
            else { newList.add(((Double)aList).intValue()); }
        }

        this.list = newList;
    }

    //MARK: Other methods

    public void sort() {
        if (this.isHaveDouble) { this.convertToDouble(); }
        this.list = (List<T>) list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public void printList() {
        for (Object aList : list) System.out.println(aList);
    }
}



