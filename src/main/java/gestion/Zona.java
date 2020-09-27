package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	List<Animal> animal = new ArrayList<Animal>();
	
	private String nombre;
	private Zoologico zo;
	
	public Zona(String nomb, Zoologico zoo) {
		nombre = nomb;
		zo = zoo;
	}
	
	public Zona() {
		
	}
	public void agregarAnimales(Animal ani) {
		animal.add(ani);
		ani.setZona(this);
	}
	
	public int cantidadAnimales() {
		return animal.size();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zo;
	}
	public void setZoo(Zoologico zoo) {
		this.zo = zoo;
	}
	public List<Animal> getAnimal(){
		return animal;
	}
	public void setAnimales (List<Animal> animal){
		this.animal = animal;
	}
	
}
