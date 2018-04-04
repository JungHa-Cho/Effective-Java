package kr.personal.cjh.c2.rule2;

// NutritionFacts_JavaBeansPattern cocaCola = new NutritionFacts_JavaBeansPattern();
// cocaCola.setServingSize(240);
// cocaCola.setServings(8);
// cocaCola.setCalories(100);
// cocaCola.setSodium(35);
// cocaCola.setCarbohydrate(27);

public class NutritionFacts_JavaBeansPattern {
	private int servingSize = -1;		// 필수 : 기본값 없음
	private int servings 	= -1;		// 필수
	private int calories	=  0;
	private int fat			=  0;
	private int sodium		=  0;
	private int carbohydrate=  0;

	public NutritionFacts_JavaBeansPattern(){ }

	// 설정자 ( setter )
	public void setServingSize		(int val) { servingSize = val; }
	public void setServings			(int val) { servings	= val; }
	public void setCalories			(int val) { calories	= val; }
	public void setFat				(int val) { fat			= val; }
	public void setsodium			(int val) { sodium		= val; }
	public void setCarbohydrate		(int val) { carbohydrate= val; }
}