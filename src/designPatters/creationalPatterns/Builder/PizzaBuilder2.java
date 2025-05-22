package designPatters.creationalPatterns.Builder;

import designPatters.creationalPatterns.Builder.Pizza.Sabor;
import designPatters.creationalPatterns.Builder.Pizza.Tamanho;

public class PizzaBuilder2 {
	private Pizza pizza;
	
	public PizzaBuilder2() {
		pizza = new Pizza();
	}
	
	public static PizzaBuilder2 builder() {
        return new PizzaBuilder2();
    }
	
	public PizzaBuilder2 tamanho(Tamanho t) {
		pizza.setTamanho(t);
		return this;
	}

	public PizzaBuilder2 sabor(Sabor s) {
		pizza.setSabor(s);
		return this;
	}

	public PizzaBuilder2 comBorda() {
		pizza.setComBorda(true);
		return this;
	}
	public PizzaBuilder2 semBorda() {
		pizza.setComBorda(false);
		return this;
	}
	
	public Pizza obterPizza() {
		return pizza;
	}
}
