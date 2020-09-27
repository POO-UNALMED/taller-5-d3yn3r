package gestion;

import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zona= new ArrayList<Zona>();
	public Zoologico(String nomb, String ubic){
		nombre = nomb;
		ubicacion = ubic;
	}
	public Zoologico(){		
	}
	public void agregarZonas(Zona zone) {
		zona.add(zone);
	}
	public int cantidadTotalAnimales() {
		int cant=0;
		for(int i=0; i< zona.size();i++) {
			Zona pr= zona.get(i);
			cant += pr.cantidadAnimales();
		}
		return cant;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zona;
	}
	public void setZona(List<Zona> zonas) {
		this.zona = zonas;
	}
}
