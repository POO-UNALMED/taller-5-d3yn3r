package zooAnimales;

import java.util.ArrayList;
import java.util.List;


public class Reptil extends Animal {
	private static List<Reptil> listado= new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	String colorEscamas;
	int largoCola;
	public Reptil(String nomb,int edd, String habit, String gene,String colo,int larg){
		super(nomb,edd,habit,gene);
		colorEscamas = colo; largoCola=larg;
		listado.add(this);
	}
	public Reptil() {
		listado.add(this);
	}
	public static int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nomb, int edd, String gene) {
		iguanas ++;
		return new Reptil(nomb, edd, "humedal", gene, "verde", 3);
	}
	public static Reptil crearSerpiente(String nomb, int edd, String gene) {
		serpientes ++;
		return new Reptil(nomb, edd, "jungla", gene, "blanco", 1);

	}
	public static List<Reptil> getListado() {
		return listado;
	}
	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}