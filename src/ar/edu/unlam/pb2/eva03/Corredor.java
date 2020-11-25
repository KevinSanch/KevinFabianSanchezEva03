package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer cantidadDeKilometrosEntrenados;
	private Integer distanciaPreferida;
	
	public Corredor(Integer numero, String nombre, Integer distancia) {
		super(nombre, numero);
		this.distanciaPreferida = distancia;
		cantidadDeKilometrosEntrenados = 0;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}

	@Override
	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	

}
