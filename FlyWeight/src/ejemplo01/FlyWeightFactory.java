package ejemplo01;

import java.util.HashMap;

public class FlyWeightFactory {
	private HashMap<Estilo,Flyweight> cache=new HashMap<Estilo,Flyweight>();
	
	public Flyweight getFlyweight(Estilo repeatingState) {
		if(!cache.containsKey(repeatingState)) {
			cache.put(repeatingState,new Flyweight(repeatingState));
		}
		return cache.get(repeatingState);
	}
}
