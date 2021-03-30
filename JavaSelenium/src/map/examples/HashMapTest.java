package map.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "UFT");
		hm.put(3, "TestComplete");
		hm.put(4, "Ranorex");
		hm.put(5, "Tosca");


		System.out.println(hm.get(3));
		System.out.println("Keys are : " + hm.keySet());
		System.out.println("Values are : " + hm.values());

		hm.remove(5);
		hm.replace(3, "Cypress");
		hm1.put(5, "Coded UI");
		hm1.put(6, "Sikuli");
		hm1.put(7, "Sikuli");


		hm.putAll(hm1);
		hm.forEach((i,j)->{System.out.println(i + " : " + j);});

		System.out.println(hm.isEmpty());

		// Iterate Hashmap
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey() +  " - " + m.getValue());
		}



	}

}
