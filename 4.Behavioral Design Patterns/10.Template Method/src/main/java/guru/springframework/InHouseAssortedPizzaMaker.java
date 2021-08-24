package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:36 AM
*/

class InHouseAssortedPizzaMaker extends PizzaTemplate {

    @Override
    void prepareIngredients() {
        System.out.println("Preparing sweet corns, chicken sausage, green chillies, and onions.");
    }

    @Override
    void addToppings() {
        System.out.println("Adding cheddar cheese and bechamel sauce along with ingredients to crust.");
    }

    @Override
    boolean customerWantsPackedPizza() {
        return false;
    }
}
