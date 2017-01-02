package SecondChapter;

// NutritionFacts_General cocaCola = new NutritionFacts_General(240, 8, 100, 3, 35, 27);

public class NutritionFacts_General {
	private final int servingSize;	// (mL)				�ʼ�
	private final int servings;		// (per container)	�ʼ�
	private final int calories;		//					����
	private final int fat;			// (g)				����
	private final int sodium;		// (mg)				����
	private final int carbohydrate; // (g)				����
	
	public NutritionFacts_General(int servingSize, int servings){
		this(servingSize, servings, 0);
	}

	public NutritionFacts_General(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}
	
	public NutritionFacts_General(int servingSize, int servings, int calories, int fat){
		this(servingSize, servings, calories, fat, 0);
	}
	
	public NutritionFacts_General(int servingSize, int servings, int calories, int fat, int sodium){
		this(servingSize, servings, calories, fat, sodium, 0);
	}
	
	public NutritionFacts_General(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate){
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
}
