package ar.edu.unlam.pb2.eva03;

public class Deportista extends Club {

	private String nombreDeportista;

	public Deportista(String nombre, Integer numero) {
		super(numero);
		this.nombreDeportista = nombre;
	}

}
