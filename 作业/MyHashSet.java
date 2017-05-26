package com.jjhe;

import java.util.*;
public class MyHashSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set h = new TreeSet(new MyComparactor());
		h.add(new Student("abc",16,66));
		h.add(new Student("cda",15,64));
		h.add(new Student("bac",14,60));
		@SuppressWarnings("rawtypes")
		Iterator iterator = h.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			//Student s = (Student)iterator.next();
			//System.out.println(s.getName()+s.getAge()+s.getScore());
		}
	}

}

