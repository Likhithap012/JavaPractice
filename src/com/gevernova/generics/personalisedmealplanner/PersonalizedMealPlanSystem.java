package com.gevernova.generics.personalisedmealplanner;

public class PersonalizedMealPlanSystem {
    public static void main(String[] args) {
        // Creating meal types
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal highProtein = new HighProteinMeal();

        // Generating personalized meal plans using the generic method
        Meal<VegetarianMeal> vegPlan = MealPlanner.generateMealPlan(veg);
        Meal<VeganMeal> veganPlan = MealPlanner.generateMealPlan(vegan);
        Meal<KetoMeal> ketoPlan = MealPlanner.generateMealPlan(keto);
        Meal<HighProteinMeal> proteinPlan = MealPlanner.generateMealPlan(highProtein);

        // Displaying the meals
        System.out.println("\n--- Your Personalized Meal Plans ---");
        vegPlan.display();
        veganPlan.display();
        ketoPlan.display();
        proteinPlan.display();
    }
}
