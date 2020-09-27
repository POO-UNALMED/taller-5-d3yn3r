package zooAnimales;
import gestion.*;

public class Animal {
	static int totalAnimales;
	String nombre;
	int edad;
	String habitat;
	String genero;
	Zona zona;
	public Animal(){
		totalAnimales++;
	}
	public Animal(String nomb, int edd, String habit, String gene){
		nombre = nomb; edad=edd; habitat=habit;genero=gene;
		totalAnimales++;
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos() + "\n" 
							+ "Aves: "+ Ave.cantidadAves() + "\n"
							+ "Reptiles: "+ Reptil.cantidadReptiles() + "\n"
							+ "Peces: "+ Pez.cantidadPeces() + "\n"
							+ "Anfibios: "+ Anfibio.cantidadAnfibios();
	}
	public String movimiento() {
		return "desplazarse";
	}
	@Override
	public String toString() {
		if (this.zona == null) {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad +", habito en " + this.habitat + " y mi genero es " + this.genero;
		}
		else {
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad +", habito en " + this.habitat + " y mi genero es " + this.genero + "\n"
				+ ", la zona en la que me ubico es " + zona +", en el " + zona.getZoo();
		}
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
