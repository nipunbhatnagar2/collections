package com.practice.collections.list;

/*
    Three operations -
    - adding element - add()
    - updating element - set()
    - removing element - remove() - one element - clear() - whole list
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {

        System.out.println("Add operation :");
        List<String> list = new ArrayList<>();

        list.add("MayThe");
        list.add("BeWithYou");

        System.out.println("Before : list :" + list);

        list.add(1,"Force");

        System.out.println("After : list :" + list);

        /*-----------------------------------------*/

        System.out.println("Update operation :");
        List<String> list1 = new ArrayList<>();

        list1.add("MayThe");
        list1.add("Force");
        list1.add("Force");

        System.out.println("Before : list :" + list1);

        list1.set(2,"BeWithYou");

        System.out.println("After : list :" + list1);

        /*-----------------------------------------*/

        System.out.println("Remove operation :");
        List<String> list2 = new ArrayList<>();

        list2.add("MayThe");
        list2.add("Force");
        list2.add("Force");
        list2.add("BeWithYou");

        System.out.println("Before : list :" + list2);

        //list2.remove(2);
        list2.remove("Force");
        //removes first occurrence

        System.out.println("After : list :" + list2);

        list2.clear();

        System.out.println("After clearing : list :" + list2);
    }
}
