package esquema;

import java.util.HashMap;

public class FlyWeightFactory {
	private HashMap<Integer,Flyweight> cache=new HashMap<Integer,Flyweight>();
	
	public Flyweight getFlyweight(int repeatingState) {
		if(!cache.containsKey(repeatingState)) {
			cache.put(repeatingState,new Flyweight(repeatingState));
		}
		return cache.get(repeatingState);
	}
}
