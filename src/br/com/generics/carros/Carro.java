package br.com.generics.carros;

public abstract class Carro<T> {
	protected String modelo;
	protected String marca;
	protected T tipoEspecifico;
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public T getTipoEspecifico() {
		return tipoEspecifico;
	} 
	
	
	public abstract void exibirInformacoesEspecificas();
	
	@Override
	public String toString() {
		return "Carro [modelo =" + modelo + ", marca=" + marca + ", tipo" + tipoEspecifico + "]";
	}
	
	
	
}




