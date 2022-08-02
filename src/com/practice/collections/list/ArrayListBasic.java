package com.practice.collections.list;

import java.util.ArrayList;

/*
     ArrayList - dynamic arrays in Java

   - Slower than standard arrays

   - Used where lots of manipulation in the array is needed

   - The size of an ArrayList is increased automatically if the collection grows or
     shrinks if the objects are removed from the collection

   - Java ArrayList allows us to randomly access the list

   - ArrayList can not be used for primitive types, like int, char, etc.
     We will need a wrapper class for such cases

   - The ArrayList class maintains the insertion order and is non-synchronized

   - Methods used - add(),size(),addAll(),get(),indexOf(),lastIndexOf(),equals()
   - other methods - hashCode(),contains(),containsAll(),sort()
 */
public class ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2,3);

        System.out.println("List 1 : " + list);
        System.out.println("Size of List : " + list.size());
        System.out.println("get() element at index [0]: " + list.get(0));
        System.out.println("IndexOf(1) : " + list.indexOf(1));
        System.out.println("LastIndexOf(1) : " + list.lastIndexOf(1));

        //access using iterator
/*        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(5);
        list2.add(4);
        list2.add(3);

        System.out.println("List 2 : " + list2);

        System.out.print("Checking if both lists are same : ");
        if(list.equals(list2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        //will add list2 from index 1
        list.addAll(1,list2);

        System.out.println("List 1 after changes : " + list);

/*        Output Analysis -
        List 1 : [1, 2, 3]
        List 2 : [5, 4, 3]
        - list2 added from index 1 of list1
        - shifting list1 index 1,2 after list2
        List 1 after changes : [1, 5, 4, 3, 2, 3]*/
    }
}
