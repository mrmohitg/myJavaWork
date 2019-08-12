package myJava.collections.map.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {

		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("105", "Mohit");
		linkedHashMap.put("101", "Rohit");
		linkedHashMap.put("102","Sohit");
		linkedHashMap.put("103", "Kohit");
		linkedHashMap.put("104", "Kohit");
		
		Set<Map.Entry<String,String>> set = linkedHashMap.entrySet();
		Iterator<Map.Entry<String,String>> iterator =set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" = "+value);
		}
	}
}
