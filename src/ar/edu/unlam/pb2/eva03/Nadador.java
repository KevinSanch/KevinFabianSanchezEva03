package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador {

	private String estiloPreferido;

	public Nadador(Integer numero, String nombre, String estilo) {
		super(nombre, numero);
		this.estiloPreferido = estilo;
	}

	@Override
	public String getEstiloPreferido() {
		return estiloPreferido;
	}

}
