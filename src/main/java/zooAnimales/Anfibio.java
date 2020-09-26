package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Anfibio extends Animal {
	private static List<Anfibio> lista= new ArrayList<Anfibio>();
	public static int salamandras;
	public static int ranas;
	private String colPiel;
	private boolean venenoso;
	public Anfibio(String nom,int ed, String hab, String gen,String col,boolean ven){
		super(nom,ed,hab,gen);
		colPiel = col; venenoso=ven;
		lista.add(this);
	}
	public Anfibio() {
		lista.add(this);
	}
	public static int cantidadAnfibios() {
		return lista.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nom, int ed, String gen) {
		ranas ++;
		return new Anfibio(nom, ed, "selva", gen, "rojo", true);
	}
	public static Anfibio crearSalamandra(String nom, int ed, String gen) {
		salamandras ++;
		return new Anfibio(nom, ed, "selva", gen, "negro y amarillo", false);
	}
	public static List<Anfibio> getListado() {
		return lista;
	}
	public static void setListado(List<Anfibio> listado) {
		Anfibio.lista = listado;
	}
	public String getColorPiel() {
		return colPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}