package model;
import java.util.*;

public class Persona {
  protected String nombre;
    protected int numTelf;
    public Persona() {
    }

    public Persona(String nombre, int numTelf) {
        this.nombre = nombre;
        this.numTelf = numTelf;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public int getNumTelf() {
     return numTelf;
    }

    public void setNumTelf(int numTelf) {
      this.numTelf = numTelf;
    }

    public @Override String toString() {
      return "Nombre: "+nombre+"Numero de telefono: "+numTelf;
    }

}