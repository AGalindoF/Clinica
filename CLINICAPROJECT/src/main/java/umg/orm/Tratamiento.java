package umg.orm;
// Generated 11/03/2020 11:12:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tratamiento generated by hbm2java
 */
public class Tratamiento  implements java.io.Serializable {


     private TratamientoId id;
     private Cita cita;
     private String traNombre;
     private String traDescripcion;
     private BigDecimal traCosto;

    public Tratamiento() {
    }

	
    public Tratamiento(TratamientoId id, Cita cita) {
        this.id = id;
        this.cita = cita;
    }
    public Tratamiento(TratamientoId id, Cita cita, String traNombre, String traDescripcion, BigDecimal traCosto) {
       this.id = id;
       this.cita = cita;
       this.traNombre = traNombre;
       this.traDescripcion = traDescripcion;
       this.traCosto = traCosto;
    }
   
    public TratamientoId getId() {
        return this.id;
    }
    
    public void setId(TratamientoId id) {
        this.id = id;
    }
    public Cita getCita() {
        return this.cita;
    }
    
    public void setCita(Cita cita) {
        this.cita = cita;
    }
    public String getTraNombre() {
        return this.traNombre;
    }
    
    public void setTraNombre(String traNombre) {
        this.traNombre = traNombre;
    }
    public String getTraDescripcion() {
        return this.traDescripcion;
    }
    
    public void setTraDescripcion(String traDescripcion) {
        this.traDescripcion = traDescripcion;
    }
    public BigDecimal getTraCosto() {
        return this.traCosto;
    }
    
    public void setTraCosto(BigDecimal traCosto) {
        this.traCosto = traCosto;
    }




}


