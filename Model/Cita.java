package model;
import java.util.*;
import java.util.Date;
public class Cita {
    private Date fecha;
    private int hInicio;
    private int hFin;

    public Cita(Date fecha, int hInicio, int hFin) {
        this.fecha = fecha;
        this.hInicio = hInicio;
        this.hFin = hFin;
    }
    public Date getFecha() {
      return fecha;  
    }
    
    public void setFecha(Date fecha) {
     this.fecha = fecha;
    }
    
    public int getHInicio() {
     return hInicio;
    }

    public void setHInicio(int hInicio) {
       this.hInicio = hInicio;
    }
    public int getHFin() {
      return hFin;
    }
    
    public void setHFin(int HFin) {
     this.hFin = hFin;
    }
    public String toString() {
        // TODO implement here
        return "Fecha: "+fecha+"Hora de Inicio: "+hInicio+"hora de fin:"+hFin;
    }

}