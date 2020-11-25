package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	public TipoDeBicicleta tipoDeBicicleta;

	public Ciclista(Integer numero, String nombre, TipoDeBicicleta tipo) {
		super(nombre, numero);
		this.tipoDeBicicleta = tipo;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

}
