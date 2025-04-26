package com.gevernova.generics.personalisedmealplanner;

// Generic class that wraps any type of MealPlan
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void display() {
        mealPlan.showMeal();
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

