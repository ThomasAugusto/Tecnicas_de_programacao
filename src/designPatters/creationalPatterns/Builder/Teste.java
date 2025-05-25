package designPatters.creationalPatterns.Builder;

import designPatters.creationalPatterns.Builder.Pizza.Sabor;
import designPatters.creationalPatterns.Builder.Pizza.Tamanho;

public class Teste {

	public static void main(String[] args) {
		
		Pizza pizza1 = PizzaBuilder
				.builder()
				.comBorda()
				.saborPortuguesa()
				.saborCalabresa()
				.tamanhoFamilia()
				.obterPizza();		
		System.out.println(pizza1);
		
		Pizza pizza2 = PizzaBuilder2
				.builder()
				.semBorda()
				.sabor(Sabor.QuatroQueijos)
				.tamanho(Tamanho.Media)
				.obterPizza();
		System.out.println(pizza2);

	}

}
