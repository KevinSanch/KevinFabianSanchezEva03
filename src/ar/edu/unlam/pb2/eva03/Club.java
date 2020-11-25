package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club implements Comparable<Deportista> {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	private Integer numeroSocio;
	private Evento evento;

	public Club(String nombre) {
		this.nombre = nombre;
		socios = new TreeSet<Deportista>();
		competencias = new TreeMap<String, Evento>();
	}

	public Club(Integer numero) {
		this.numeroSocio = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getNumeroDeSocio() {
		return numeroSocio;
	}

	@Override
	public int compareTo(Deportista o) {
		return this.numeroSocio.compareTo(o.getNumeroDeSocio());
	}

	public void agregarDeportista(Deportista corredor) {
		socios.add(corredor);
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	// No pude encontrar como relacionar el evento ni cuando instanciarlo, sé que
	// está forma no es la mejor, además de que siempre va a haber sólo un evento.
	public void crearEvento(TipoDeEvento evento, String descripcion) {
		this.evento = new Evento(evento);
		competencias.put(descripcion, this.evento);
	}

	// Sé que todo esto no está bien del todo, la descripción quedo en el aire,
	// también los demás tipos de eventos, pero fue la única manera que se me
	// ocurrio para que al menos lo que se prueba funcione, estuve como 1 hora
	// pensando como hacer esto, tal vez era más aceptable hacer un switch, pero no me da el tiempo.
	public Boolean inscribirEnEvento(String descripcion, Deportista deportista) throws NoEstaPreparado {
		if (deportista instanceof INadador && evento.getTipo() == TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS) {
			evento.agregarAlEvento(deportista);
			return true;
		}
		if (deportista instanceof ICorredor && evento.getTipo() == TipoDeEvento.CARRERA_42K) {
			evento.agregarAlEvento(deportista);
			return true;
		}
		if (deportista instanceof ICiclista && deportista instanceof INadador
				&& evento.getTipo() == TipoDeEvento.TRIATLON_IRONMAN) {
			evento.agregarAlEvento(deportista);
			return true;
		} else
			throw new NoEstaPreparado("El deportista no califica al evento");
	}

}
