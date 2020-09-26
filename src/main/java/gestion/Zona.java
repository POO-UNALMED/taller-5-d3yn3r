package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	List<Animales> animal = new ArrayList<Animales>();
	
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
	public Zoologico setZoo(Zoologico zoo) {
		this.zo = zoo;
	}
	public List<Animales> getAnimal(){
		return animal;
	}
	public void setAnimales (List<Animales> animal){
		this.animal = animal;
	}
	
}
