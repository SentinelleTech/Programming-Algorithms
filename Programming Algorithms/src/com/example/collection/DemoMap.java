package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoMap {
	
			Map<String, String> m, m2;
			Iterator<String> it;

	public DemoMap() {
		
			m = new HashMap<String, String>();
			m.put("John", "079876542");
			m.put("Peter", "0700987654");
			m.put("Kym", "0751443322");
			m.put("Priscilla", "0799");
			
//////////////// Iterator: key ///////////////////
//			it = m.keySet().iterator();
//			while(it.hasNext()){
//				Object k = it.next();
//				Object v = m.get(k);
//				System.out.println(v);
//			}
			
			
/////////////// for-each loop: key ////////////////			
//		for(Object obj : m.keySet()){				
//				Object v = m.get(obj);
//				System.out.println(v);				
//			}
		
			
			
			
			
			
			
			
///////////// Iterator: values ///////////////
			
//				it = m.values().iterator();
//				while(it.hasNext()){
//					System.out.println(it.next());
//				}
			

/////////////// for-each loop: values ///////////////			
				for(Object v: m.values()){
					System.out.println(v);
				}
			
			
			
			
			
			
			
			
			
			
			
			
	}

	
	public static void main(String[] args) {
		new DemoMap();
	}

}
