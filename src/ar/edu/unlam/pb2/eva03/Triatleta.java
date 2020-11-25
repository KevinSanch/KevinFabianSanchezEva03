package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

//Habia incorporado a ICorredor también pero los tipos son distintos en el método como condición en el eda.
public class Triatleta extends Deportista implements ICiclista, INadador {

	private String estiloPreferido;
	private Integer cantidadDeKilometrosEntrenados;
	private String distanciaPreferida;
	public TipoDeBicicleta tipoDeBicicleta;

	public Triatleta(Integer numero, String nombre, String distancia, TipoDeBicicleta tipo) {
		super(nombre, numero);
		this.distanciaPreferida = distancia;
		this.tipoDeBicicleta = tipo;
	}

	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados = km;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantidadDeKilometrosEntrenados;
	}

	public String getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	@Override
	public String getEstiloPreferido() {
		return this.estiloPreferido;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipoDeBicicleta;
	}

}
