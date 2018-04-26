package com.company;

import java.util.ArrayList;
import java.util.List;

// Can be added in the future

public class Logic {
    private ListManager listManager;

    public <N extends Number & Comparable> Logic(N initialElement) {
        this.listManager = new ListManager<>();
    }

//    public <N extends Number & Comparable> void addElement(N element) {
//
//        if (listManager.getType() == element.getClass())
//            listManager.addElement(element);
//        else {
//            List<N> list = new ArrayList<>();
//            listManager.getList().stream().forEach(o -> list.add((N) o));
//            listManager.setList(list);
//        }
//    }
}