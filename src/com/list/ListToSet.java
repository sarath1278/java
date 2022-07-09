package com.list;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListToSet {
	public static void main(String[] args) {

		// list to set

		List li = new LinkedList();
		li.add(10);
		li.add(20);
		li.add("java");

		System.out.println("List :" + li);

		Set s = new LinkedHashSet();
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println("Set :" + s);
		System.out.println("****Copying value from list to set****");
		li.addAll(s);

		System.out.println(li);

		// find list length
		System.out.println("*****list length*****");

		int size = li.size();
		System.out.println(size);

		System.out.println("*****1st 5 values in list*****");

		// 1st 5 values in list
		for (int i = 0; i < 5; i++) {
			Object object = li.get(i);
			System.out.println(object);
		}
		System.out.println("****last index value in list****");

		Object object2 = li.get(li.size() - 1);
		System.out.println(object2);
		System.out.println("*****last 5 index values in list*****");

		for (int i = 1; i < 6; i++) {
			Object object = li.get(i);
			System.out.println(object);

		}
		System.out.println("*****middle index value*****");

		Object object = li.get(li.size() / 2);
		System.out.println(object);

		System.out.println("****Alternate number in list****");

		for (int i = 0; i < 6; i = i + 2) {
			System.out.println(li.get(i));

		}
		System.out.println("****Iterate list using for loop****");
		for (int i = 0; i < li.size(); i++) {
			Object object3 = li.get(i);
			System.out.println(object3);
		}
		System.out.println("****Iterate using Enhanced for loop****");

		for (Object k : li) {
			System.out.println(k);

		}
		System.out.println("****1st index value in list****");
		Object object3 = li.get(0);
		System.out.println(object3);

	}

}
