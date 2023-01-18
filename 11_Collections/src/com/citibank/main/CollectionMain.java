package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println("1. Array List");
		List<String> nameList = new ArrayList<>();
		System.out.println("Name List Size : " + nameList.size());
		System.out.println("Name List : " + nameList);

		nameList.add("Debayan");
		nameList.add("Paritosh");
		nameList.add("Amol");
		nameList.add("Paritosh");

		System.out.println("Name List Size : " + nameList.size());
		System.out.println("Name List : " + nameList);

		nameList.removeAll(nameList);

		System.out.println("Name At Index 2 : " + nameList.size());

		System.out.println("-------------------------------");

		System.out.println("2. HashSet");
		Set<Integer> numberSet = new HashSet<>();

		System.out.println("Number Set Size : " + numberSet.size());
		System.out.println("Number Set : " + numberSet);

		numberSet.add(180);
		numberSet.add(281);
		numberSet.add(180);
		numberSet.add(921);
		numberSet.add(151);
		numberSet.add(109);

		System.out.println("After Adding");
		System.out.println("Number Set Size : " + numberSet.size());
		System.out.println("Number Set : " + numberSet);

		Iterator<Integer> iterator = numberSet.iterator();  
        while(iterator.hasNext())  
        {  
        System.out.println(iterator.next()); 
		}
		
		System.out.println("-------------------------------");

		System.out.println("3. TreeSet");
		Set<String> nameTreeSet = new TreeSet<>();

		System.out.println("Number Set Size : " + nameTreeSet.size());
		System.out.println("Number Set : " + nameTreeSet);

		nameTreeSet.add("Y");
		nameTreeSet.add("C");
		nameTreeSet.add("P");
		nameTreeSet.add("L");

		System.out.println("After Adding");
		System.out.println("Number Set Size : " + nameTreeSet.size());
		System.out.println("Number Set : " + nameTreeSet);

		System.out.println("Main End");
	}

}
