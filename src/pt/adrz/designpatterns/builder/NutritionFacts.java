package pt.adrz.designpatterns.builder;

public class NutritionFacts {
	
	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;
	
	private NutritionFacts(Builder builder) {
		
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carobhydrate;
	}

	public static class Builder {
		
		// required parameters
		private final int servingSize;
		private final int servings;
		
		// optional
		private int calories = 0;
		private int fat = 0;
		private int carobhydrate = 0;
		private int sodium = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			this.calories = val; 
			return this;
		}

		public Builder fat(int val) {
			this.fat = val; 
			return this;
		}

		public Builder carbohydrate(int val) {
			this.carobhydrate = val; 
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val; 
			return this;
		}

		public  NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	
	public static void main(String[] args) throws Exception { 
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(34).carbohydrate(27).build();
	}
}
