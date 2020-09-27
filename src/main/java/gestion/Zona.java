package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	List<Animal> animal = new ArrayList<Animal>();
	
	String nombre;
	Zoologico zo;
	
	public Zona(String nombre, Zoologico zo) {
		this.nombre = nombre;
		this.zo = zo;
	}
	
	public Zona() {
		
	}
	
	public void addAnimal(Animal anim) {
		animal.add(anim);
		
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
