package myJava.collections.map.sortedmap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, String> treemap = new TreeMap<>();
		treemap.put("1004", "Nikhil");
		treemap.put("1002", "Vipul");
		treemap.put("1001", "Anurag");
		treemap.put("1005", "Nishant");
		treemap.put("1003", "Mohit");
		
		Set<Entry<String, String>> set = treemap.entrySet();
		Iterator<Entry<String, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "- "+entry.getValue());
		}
	}
}
