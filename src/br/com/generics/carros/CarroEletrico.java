package br.com.generics.carros;

public class CarroEletrico extends Carro<Double>{

	public CarroEletrico(String modelo, String marca, Double autonomia) {
		this.modelo = modelo;
		this.marca = marca;
		this.tipoEspecifico = autonomia;
		
	}

	
	
	@Override
	public void exibirInformacoesEspecificas() {
		System.out.printf("Elétrico - Autonomia de % 1f km%n", tipoEspecifico);
		
	}

}
