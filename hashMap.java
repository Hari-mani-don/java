package Mani;

import java.util.Map;
import java.util.HashMap;

public class New {
    public static void main(String[] args) {
    	Map<String, Integer> popular = new HashMap<>();
    	popular.put("hari",  93619318);
    	popular.put("mani", 3256);
    	
    	System.out.println(popular.get("hari"));
    	
    	for(Map.Entry<String, Integer> entry : popular.entrySet()) {
    		System.out.println(entry.getKey() + entry.getValue());
    	}
    }
}


