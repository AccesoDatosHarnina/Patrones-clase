package primeraImplementacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuilderTest {

	@Test
	void test() {
		NutritionFacts cocaCola=new NutritionFacts.Builder(250,8)
				.calories(100)
				.sodium(35)
				.carbohydrate(27).build();
	}

}
