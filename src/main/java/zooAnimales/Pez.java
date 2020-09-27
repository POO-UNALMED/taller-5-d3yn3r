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
}