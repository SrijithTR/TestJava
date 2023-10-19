package org.test;

import java.util.LinkedList;
import java.util.List;

public class CollectionsLinked {

	public static void main(String[] args) {
		List l = new LinkedList();
		System.out.println(l);
		
	l.add("Srijith");
	l.add('R');
	l.add(35);
	l.add("Thrissur");
	l.add(9940682419l);
	l.add(5.9f);
	l.add(true);
	System.out.println(l);
	
	int size = l.size();
	System.out.println(size);
	
	Object object = l.get(0);
	System.out.println(object);
	
	l.add(4, "trsrijith@gmail.com");
	System.out.println(l);
	
	l.remove(6);
	System.out.println(l);
	
	l.set(4, 680304);
	System.out.println(l);
	
	int indexOf = l.indexOf("Thrissur");
	System.out.println(indexOf);
	
	int lastIndexOf = l.lastIndexOf("Thrissur");
	System.out.println(lastIndexOf);
	
	boolean contains = l.contains(680304);
	System.out.println(contains);
	
	boolean empty = l.isEmpty();
	System.out.println(empty);
	
	List li = new LinkedList();
	li.add("Srijith");
	li.add("Selenium");
	li.add("Greens");
	li.add("OMR");
	li.add(2023);
	System.out.println(li);
	
	li.addAll(l);
	System.out.println(li);
	
	li.retainAll(l);
	System.out.println(li);
	
	li.removeAll(l);
	System.out.println(li);
	
		
		
		
	}
}
