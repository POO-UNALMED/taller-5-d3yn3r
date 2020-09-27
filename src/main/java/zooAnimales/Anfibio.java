package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Anfibio extends Animal {
	private static List<Anfibio> listado= new ArrayList<Anfibio>();
	int ranas;
	int salamandras;
	String colorPiel;
	boolean venenoso;
	public Anfibio(String nomb,int edd, String habit, String gene,String colo,boolean venen){
		super(nomb,edd,habit,gene);
		colorPiel = colo; venenoso=venen;
		listado.add(this);
	}
	public Anfibio() {
		listado.add(this);
	}
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public  Anfibio crearRana(String nomb, int edd, String gene) {
		ranas ++;
		return new Anfibio(nomb, edd, "selva", gene, "rojo", true);
	}
	public  Anfibio crearSalamandra(String nomb, int ed, String gen) {
		salamandras ++;
		return new Anfibio(nomb, ed, "selva", gen, "negro y amarillo", false);
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