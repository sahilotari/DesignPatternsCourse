package org.sahilo.StructuralPatterns.DecoratorPattern.Solution;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.00;
    }
}