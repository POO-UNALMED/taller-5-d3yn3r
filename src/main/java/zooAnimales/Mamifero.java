package zooAnimales;
import java.util.*;



public class Mamifero extends Animal {
	static List<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	boolean pelaje;
	int patas;
	public Mamifero(String nomb,int edd, String habit, String gene, boolean pel, int pati){
		super(nomb,edd,habit,gene);
		pelaje = pel; patas=pati;
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public static Mamifero crearCaballo(String nomb, int edd, String gene) {
		caballos ++;
		return new Mamifero(nomb, edd, "pradera", gene, true, 4);
	}
	public static Mamifero crearLeon(String nomb, int edd, String gene) {
		leones ++;
		return new Mamifero(nomb, edd, "selva", gene, true,4);
	}
	
}