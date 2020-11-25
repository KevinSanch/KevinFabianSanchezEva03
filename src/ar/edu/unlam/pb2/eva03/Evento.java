package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;

	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		participantes = new TreeMap<Integer, Deportista>();
		numeroDeInscripcion = 0;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public Boolean agregarAlEvento(Deportista deportista) {
		numeroDeInscripcion++;
		participantes.put(numeroDeInscripcion, deportista);
		return true;
	}

}
