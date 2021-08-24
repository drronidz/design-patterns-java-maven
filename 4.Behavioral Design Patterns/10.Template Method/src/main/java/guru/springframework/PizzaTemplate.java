package guru.springframework;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:20 AM
*/

abstract class PizzaTemplate {
    public void makePizza() {
        preparePizzaDough();
        preBakeCrust();
        prepareIngredients();
        addToppings();
        bakePizza();
        if(customerWantsPackedPizza()) {
            packPizza();
        }
    }

    final void preparePizzaDough() {
        System.out.println("Preparing pizza dough with plain flour, " +
                "dried yeast, caster sugar, salt, olive oil, and warm water");
    }
    final void preBakeCrust() {
        System.out.println("Pre baking crust at 325 F for 3 minutes");
    }
    abstract void prepareIngredients();

    abstract void addToppings();

    void bakePizza() {
        System.out.println("Baking pizza at 400 F for 12 minutes.");
    }
    void packPizza() {
        System.out.println("Packing pizza in pizza delivery box.");
    }
    boolean customerWantsPackedPizza() {
        return true;
    }
}

