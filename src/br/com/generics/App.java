package br.com.generics;
import java.util.ArrayList;
import java.util.List;

import br.com.generics.carros.Carro;
import br.com.generics.carros.CarroEletrico;
import br.com.generics.carros.CarroEsportivo;

public class App {

	public static void main(String[] args) {
		List<Carro<?>> garagem = new ArrayList<>();
		
		garagem.add(new CarroEsportivo("911 Turbo", "Porsche", 588));
		
		garagem.add(new CarroEletrico("Model 3", "Tesla", 567.5));
		
		garagem.add(new CarroEsportivo("Aventador", "Lamborghini", 778));
		
		garagem.add(new CarroEletrico("e-tron", "Audi", 436.8));
		
		
		System.out.println("*** Carros Na Garagem ***");
		for (Carro<?>carro : garagem) {
			System.out.println("\nMarca: " + carro.getMarca());
			System.out.println("Modelo: " + carro.getModelo());
			carro.exibirInformacoesEspecificas();
			
		}
		System.out.println("*** LISTA COMPLETA ***");
		garagem.forEach(System.out::println);
	}

}
