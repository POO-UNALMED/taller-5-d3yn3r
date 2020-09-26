package gestion;

import java.util.*;



public class Zoologico {

	String ubicacion;
	String nombre;
	private List<Zona> zona= new ArrayList<Zona>();
	public Zoologico(String ubica, String nomb){
		this.nombre=nomb;
		this.ubicacion=ubica;
	}
	
	public Zoologico() {
		
	}
	public void agregarZonas(Zona zon) {
		zona.add(zon);
	}
	
	public int cantidadTotalAnimales() {
		int cant=0;
		for(int i=0; i< zona.size();i++) {
			Zona obte= zona.get(i);
			cant += obte.cantidadAnimales();
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
