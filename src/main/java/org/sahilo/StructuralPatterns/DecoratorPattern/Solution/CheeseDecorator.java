package org.sahilo.StructuralPatterns.DecoratorPattern.Solution;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.50;
    }
}
