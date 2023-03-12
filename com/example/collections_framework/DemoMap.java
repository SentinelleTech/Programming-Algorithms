package com.example.collections_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	
	Map<String, String> mapA, mapB;
	Iterator<String> it;

	public DemoMap() {
		
		mapA = new HashMap<String, String>();
		
		mapA.put("9193-86", "Patrick");
		mapA.put("9194-10", "Ibrahim");
		mapA.put("9259-72", "Lynn");
		mapA.put("9184-74", "Lee");
		mapA.put("9164-81", "Mark");
		mapA.put("9100-81", null);
		
		//System.out.println(mapA.get("9100-81"));
		
		
		mapB = new TreeMap<String, String>();
		mapB.put("9193-00", "John");
		
		mapB.putAll(mapA);
		
		
		
		
		
		for(Object obj : mapB.values()){
			System.out.println(obj);
		}
		
		
		
		
		
		
//		it = mapB.values().iterator();
//		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
//		
		
		
		
		
//		for(Object obj : mapB.keySet()){
//			
//			System.out.println(mapB.get(obj));
//			
//		}
		
		
		
		
		
		
//		it = mapB.keySet().iterator();
//		
//		while(it.hasNext()){
//			
//			Object k = it.next();
//			
//			Object val = mapB.get(k);
//			
//			System.out.println(val);
//			
//		}
		
		
		
		
		
		
		
		
		
		
//		boolean k = mapB.containsKey("9194-10");		
//		
//		System.out.println(k);
//		
//		boolean v = mapB.containsValue("Mark");
//		
//		System.out.println(v);
		
	}

	
	public static void main(String[] args) {
		new DemoMap();

	}

}
