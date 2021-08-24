package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:36 AM
*/

class VegPizzaMaker extends PizzaTemplate{

    @Override
    void prepareIngredients() {
        System.out.println("Preparing mushroom, tomato slices, onions, and fresh basil leaves.");
    }

    @Override
    void addToppings() {
        System.out.println("Adding mozzarella cheese and tomato sauce along with ingredients to crust.");
    }
}
