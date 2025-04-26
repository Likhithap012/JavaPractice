package com.gevernova.generics.personalisedmealplanner;

// Utility class with a generic method for validation
class MealPlanner {

    // Generic method that accepts only valid MealPlans
    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        System.out.println("Validating and generating your personalized meal plan...");
        return new Meal<>(meal);
    }
}

