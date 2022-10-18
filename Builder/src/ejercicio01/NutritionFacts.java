package ejercicio01;

import teoria.PersonaConstruccion.Builder;

public class NutritionFacts {

	// obligatorias
	private final int servingSize;
	private final int servings;
	// opcionales
	private final int calories;
	private final int fat;

	private NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
	}

	public static class Builder {
		private final int servingSize;
		private final int servings;
		// opcionales
		private int calories = 0;
		private int fat = 0;

		public Builder(int servingSize, int servings) {
			super();
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
}
