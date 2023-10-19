package org.test;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		List l = new ArrayList();
		
		System.out.println(l);
		
		l.add("Java");
		l.add(20);
		l.add(9940682419l);
		l.add('v');
		l.add(true);
		l.add(7.5f);
		l.add("Java");
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(3);
		System.out.println(object);
		
		l.add(2, "SQL");
		System.out.println(l);
		
		l.remove(3);
		System.out.println(l);
		
		l.set(5, "API");
		System.out.println(l);
		
		int indexOf = l.indexOf("Java");
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf("Java");
		System.out.println(lastIndexOf);
		
		boolean contains = l.contains("SQL");
		System.out.println(contains);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		List li = new ArrayList();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		System.out.println(li);
		
		li.addAll(l);
		System.out.println(li);
		
		li.retainAll(l);
		System.out.println(li);
		
		li.removeAll(l);
		System.out.println(li);
		
		
		
		
		
	}
}
