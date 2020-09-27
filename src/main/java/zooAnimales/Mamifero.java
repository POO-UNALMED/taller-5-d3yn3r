package zooAnimales;
import java.util.*;



public class Mamifero extends Animal {
	static List<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	boolean pelaje;
	int patas;
	public Mamifero(String nom,int ed, String hab, String gen, boolean pel, int pat){
		super(nom,ed,hab,gen);
		pelaje = pel; patas=pat;
		listado.add(this);
	}
	
}