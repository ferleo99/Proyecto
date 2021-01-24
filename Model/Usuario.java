package model;
import java.util.*;

public class Usuario {

    public Usuario() {
    }
    private Persona persona;
    private String codAutent;
    
    public Usuario(String codAutent, Persona persona){
        this.codAutent=codAutent;
        this.persona=persona;
    }
    public String getCodAuntent() {
        return codAutent;
    }
    public void setCodAuntent(String CodAutent) {
        
    }
    public Persona getPersona() {
      return persona;
    }
    public void setPersona(Persona persona) {
     this.persona=persona;
    }
    public @Override String toString() {
        return "Codigo de Autenticidad: "+codAutent+persona.toString();
    }

}