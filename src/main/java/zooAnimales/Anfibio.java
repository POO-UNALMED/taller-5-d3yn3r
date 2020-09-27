package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Anfibio extends Animal {
	private static List<Anfibio> listado= new ArrayList<Anfibio>();
	int ranas;
	int salamandras;
	String colorPiel;
	boolean venenoso;
	public Anfibio(String nom,int ed, String hab, String gen,String col,boolean ven){
		super(nom,ed,hab,gen);
		colorPiel = col; venenoso=ven;
		listado.add(this);
	}
	public Anfibio() {
		listado.add(this);
	}
	public int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public  Anfibio crearRana(String nom, int ed, String gen) {
		ranas ++;
		return new Anfibio(nom, ed, "selva", gen, "rojo", true);
	}
	public  Anfibio crearSalamandra(String nom, int ed, String gen) {
		salamandras ++;
		return new Anfibio(nom, ed, "selva", gen, "negro y amarillo", false);
	}
	public  List<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}