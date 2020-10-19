package pk.cui.bridge;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meal americanMeal = new Meal();
		americanMeal.getFirstCourse();
		americanMeal.getSecondCourse();
		americanMeal.getBeverage();
		americanMeal.getDessert();
		System.out.println("----------");

		//Italian Snack
		Snack italianSnack = new Snack("Italian");
		italianSnack.getSnack();
		System.out.println("----------");

		//French Five-course Meal
		FiveCourseMeal frenchfiveCourseMeal = 
				new FiveCourseMeal("French");
		frenchfiveCourseMeal.getEnormousDinner();
	}

}
