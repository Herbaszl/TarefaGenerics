package br.com.generics.carros;

public class CarroEsportivo extends Carro<Integer>{

	public CarroEsportivo(String modelo, String marca, Integer potencia) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.tipoEspecifico = potencia;
		
	}
	
	
	
	
	@Override
	public void exibirInformacoesEspecificas() {
	System.out.printf("Esportivo - %d cavalos de potência%n", tipoEspecifico);		
	}
	

}
