package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:36 AM
*/

class NonVegPizzaMaker extends PizzaTemplate {

    @Override
    void prepareIngredients() {
        System.out.println("Preparing chicken ham, onion, chicken sausages, and smoked chicken");
    }

    @Override
    void addToppings() {
        System.out.println("Adding cheese, pepper jelly, and BBQ sauce along with ingredients to crust.");
    }
}
