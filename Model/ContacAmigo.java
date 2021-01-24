package model;
import java.util.*;

public class ContacAmigo extends Persona {

     private String correo;
    public ContacAmigo(String nombre, int numTelf, String correo) {
     super(nombre, numTelf);
     this.correo=correo;
    }

    public String getCorreo() {
       return correo;
    }

    public void setCorreo(String correo) {
       this.correo=correo;
    }

    public @Override String toString() {
        return super.toString()+"Correo: "+correo;
    }

}