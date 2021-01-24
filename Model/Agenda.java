package model;
import java.util.*;
public class Agenda {
    
    protected String contacto;
    public Agenda(String contacto) {
        this.contacto = contacto;
    }
    
   public List<Persona> guardar() {
        // TODO implement here
        return null;
    }
   
    public void agregarElemento() {
        // TODO implement here
    }
    
    public void Consultar() {
        // TODO implement here
    }
    
    public void eliminarDatos() {
        // TODO implement here
    }
    
    public void Modificar() {
      
    }
    
    public List<Cita> listarCita() {
        // TODO implement here
        return null;
    }
    public void Ordenar() {
        // TODO implement here
    }
    
    public String getContacto() {
       return contacto;
    }
    public void setContacto(String contacto) {
    this.contacto = contacto;
    }
    public  String toString() {
        // TODO implement here
        return "Contacto"+contacto+toString();
    }
}