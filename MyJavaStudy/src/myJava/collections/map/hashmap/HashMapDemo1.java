package myJava.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("100", "Mohit");
		hashMap.put("101", "Rohit");
		hashMap.put("102", "Sohit");
		hashMap.put("103", "Kohit");
		hashMap.put("103", "Tohit");
		
		Set<Map.Entry<String,String>> set = hashMap.entrySet();
		Iterator<Map.Entry<String,String>> iterator =set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" = "+value);
		}
	}
}
