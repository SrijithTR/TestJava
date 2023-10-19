package org.test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsMap {
	public static void main(String[] args) {
		
		Map<Integer,String> mi = new LinkedHashMap<>();
		
		System.out.println("======Linked HashMap======");
		mi.put(10, "java");
		mi.put(20, "java");
		mi.put(30, "API");
		mi.put(40, "python");
		mi.put(40, "SQL");
		System.out.println(mi);
		
		int size = mi.size();
		System.out.println(size);
		
		boolean containsKey = mi.containsKey(20);
		System.out.println(containsKey);
		
		boolean containsValue = mi.containsValue("java");
		System.out.println(containsValue);
		
		Set<Integer> keySet = mi.keySet();
		System.out.println(keySet);
		
		Collection<String> values = mi.values();
		System.out.println(values);
		
		Set<Entry<Integer,String>> entrySet = mi.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
				
		}
		
		System.out.println("\t\t======Hashtable=======");
		
		Map<Integer,String> ht = new Hashtable<>();
		
		ht.put(10, "chennai");
		ht.put(40, "Mumbai");
		ht.put(30, "Delhi");
		ht.put(50, "Goa");
		ht.put(20, "Thrissur");
		ht.put(40, "Manali");
		System.out.println(ht);
		
		int size2 = ht.size();
		System.out.println(size2);
		
		boolean containsKey2 = ht.containsKey(40);
		System.out.println(containsKey2);
		
		boolean containsValue2 = ht.containsValue("Manali");
		System.out.println(containsValue2);
		
		Set<Integer> keySet2 = ht.keySet();
		System.out.println(keySet2);
		
		Collection<String> values2 = ht.values();
		System.out.println(values2);
		
		Set<Entry<Integer,String>> entrySet2 = ht.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			Integer key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
		}
		
	}

}
