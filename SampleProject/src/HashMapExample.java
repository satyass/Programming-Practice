import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public Map createMap(){		
		Map map = new HashMap();
		map.put("one", "Ram");
		map.put("two", "Krishna");
		map.put("three", "John");
		return map;		
	}
	
	public Object getValue(Map map, Object key){
		return map.get(key);
	}

	public static void main(String[] args) {
		
		HashMapExample me = new HashMapExample();
		Map map = me.createMap();
		System.out.println(map);
		Object element = me.getValue(map, "three");
		System.out.println("ELement value ="+element);
		
		
	}

}
