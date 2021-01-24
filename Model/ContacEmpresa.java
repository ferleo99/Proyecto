package model;
import java.util.*;
import java.util.Date;
public class ContacEmpresa extends Persona {
    
  private String nomEmpresa;
  
    public ContacEmpresa(String nombre, int numTelf, String nomEmpresa){
    super(nombre, numTelf);
     this.nomEmpresa= nomEmpresa;
    }
    public String getNomEmpresa() {
     return nomEmpresa;
    }
    public void setNomEmpresa(String nomEmpresa) {
     this.nomEmpresa= nomEmpresa;
    }
    public @Override String toString(){
      return super.toString()+"Nombre de empresa: "+nomEmpresa;  
    }

}