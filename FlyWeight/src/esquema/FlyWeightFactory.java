package esquema;

public class FlyWeightFactory {

	public static FlyWeight getFlyWeight(RepeatingAbstactState repeatingAbstactState) {
		return new FlyWeight(repeatingAbstactState);
	}
}
