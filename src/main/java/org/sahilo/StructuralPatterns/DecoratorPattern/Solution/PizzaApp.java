package org.sahilo.StructuralPatterns.DecoratorPattern.Solution;

public class PizzaApp {
    public static void main(String[] args) {
        // Create a basic pizza
        Pizza myPizza = new BasicPizza();
        System.out.println(myPizza.getDescription() + " Cost: $" + myPizza.getCost());

        // Add cheese topping
        myPizza = new CheeseDecorator(myPizza);
        System.out.println(myPizza.getDescription() + " Cost: $" + myPizza.getCost());

        // Add olives topping
        myPizza = new OliveDecorator(myPizza);
        System.out.println(myPizza.getDescription() + " Cost: $" + myPizza.getCost());

    }
}
