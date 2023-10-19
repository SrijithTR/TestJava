package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMaps2 {

	public static void main(String[] args) {
		Map<Integer, String> mh = new HashMap();
		
		System.out.println("\t\t=====HashMap=====");
		
		mh.put(10, "Srijith");
		mh.put(20, "35");
		mh.put(20, "Thrissur");
		mh.put(30, "chennai");
		mh.put(40, "Thrissur");
		System.out.println(mh);
		
		int size = mh.size();
		System.out.println(size);
		
		boolean containsKey = mh.containsKey(20);
		System.out.println(containsKey);
		
		boolean containsValue = mh.containsValue("35");
		System.out.println(containsValue);
		
		Set<Integer> keySet = mh.keySet();
		System.out.println(keySet);
		
		Collection<String> values = mh.values();
		System.out.println(values);
		
		Set<Entry<Integer,String>> entrySet = mh.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
			
		}
		
		System.out.println("\t\t=====TreeMap====");
		
		Map<Integer,String> ma = new TreeMap<>();
		
		ma.put(40, "Srijith");
		ma.put(20, "OMR");
		ma.put(30, "chennai");
		ma.put(10, "Greens");
		ma.put(50, "9940682419");
		ma.put(50, "Java");
		System.out.println(ma);
		
		int size2 = ma.size();
		System.out.println(size2);
		
		boolean containsKey2 = ma.containsKey(50);
		System.out.println(containsKey2);
		
		boolean containsValue2 = ma.containsValue("9940682419");
		System.out.println(containsValue2);
		
		Set<Integer> keySet2 = ma.keySet();
		System.out.println(keySet2);
		
		Collection<String> values2 = ma.values();
		System.out.println(values2);
		
		Set<Entry<Integer,String>> entrySet2 = ma.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			Integer key = entry.getKey();
			System.out.println(key);
			
			String value = entry.getValue();
			System.out.println(value);
			
		}
		
		
		
		
	}
}
