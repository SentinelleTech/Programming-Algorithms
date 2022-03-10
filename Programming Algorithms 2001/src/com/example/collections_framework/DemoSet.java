package com.example.collections_framework;

/*import java.util.HashSet;
import java.util.LinkedHashSet;*/
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
	
	Set<String> setA, setB, setC;
	Iterator<String> it;

	public DemoSet() {
		
		System.out.println("LIST OF PROGRAMMING LANGUAGES");
		System.out.println("------------------------------");
		setA = new TreeSet<>();
		setA.add("Java");
		setA.add("JavaScript");
		setA.add("Php");
		setA.add("Python");		
		setA.add("Ruby");
		setA.add("Pearl");
		setA.add("SQL");
		
		
		for(Object ins : setA){
			System.out.println(ins);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//////////// convert the set to an array varible ///////////
		/*Object[] arr = setA.toArray();
		
		for(Object obj : arr){
			System.out.println(obj);
		}*/
		
		
		
		
		
//		it = setA.iterator();
//		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		
		
		
		
		
		
		
		
		
		
		/*setB = new TreeSet();
		setB.add(12);
		setB.add(5000);
		setB.add(25);
		setB.add(150000);
		setB.add(2);
		
		it = setB.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		
		/*setC = new HashSet();
		setC.add("Ibrahim");
		setC.add("Mwangi");
		setC.add(20);
		setC.add(120000.50);*/
		
		
//		int kipimo = setA.size();
//		
//		System.out.println(kipimo);
		
	}

	
	public static void main(String[] args) {
		new DemoSet();

	}

}
