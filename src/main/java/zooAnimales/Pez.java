package zooAnimales;
import java.util.*;
public class Pez extends Animal {
	private static List<Pez> listado= new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	String colorEscamas;
	int cantidadAletas;
	public Pez(String nomb,int edd, String habit, String gene,String colo,int cant){
		super(nomb,edd,habit,gene);
		colorEscamas = colo; cantidadAletas=cant;
		listado.add(this);
	}
	public Pez() {
		listado.add(this);
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nomb, int edd, String gene) {
		salmones ++;
		return new Pez(nomb, edd, "oceano", gene, "rojo", 6);
	}
	public static Pez crearBacalao(String nomb, int edd, String gene) {
		bacalaos ++;
		return new Pez(nomb, edd, "oceano", gene, "gris", 6);
	}
	public static List<Pez> getListado() {
		return listado;
	}
	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
}