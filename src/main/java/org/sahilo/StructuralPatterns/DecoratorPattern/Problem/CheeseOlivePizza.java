package org.sahilo.StructuralPatterns.DecoratorPattern.Problem;

public class CheeseOlivePizza extends CheesePizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}
