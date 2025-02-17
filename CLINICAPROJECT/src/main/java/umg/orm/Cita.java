package umg.orm;
// Generated 11/03/2020 11:12:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cita generated by hbm2java
 */
public class Cita  implements java.io.Serializable {


     private BigDecimal citaCita;
     private Date citaFecha;
     private BigDecimal citaPaciente;
     private String citaObservacion;
     private String citaTratamiento;
     private Date citaHora;
     private String citaEstado;
     private String citaMedico;
     private Date citaHoraconsulta;
     private Set tratamientos = new HashSet(0);
     private Set facturas = new HashSet(0);
     private Set citaProductos = new HashSet(0);

    public Cita() {
    }

	
    public Cita(BigDecimal citaCita) {
        this.citaCita = citaCita;
    }
    public Cita(BigDecimal citaCita, Date citaFecha, BigDecimal citaPaciente, String citaObservacion, String citaTratamiento, Date citaHora, String citaEstado, String citaMedico, Date citaHoraconsulta, Set tratamientos, Set facturas, Set citaProductos) {
       this.citaCita = citaCita;
       this.citaFecha = citaFecha;
       this.citaPaciente = citaPaciente;
       this.citaObservacion = citaObservacion;
       this.citaTratamiento = citaTratamiento;
       this.citaHora = citaHora;
       this.citaEstado = citaEstado;
       this.citaMedico = citaMedico;
       this.citaHoraconsulta = citaHoraconsulta;
       this.tratamientos = tratamientos;
       this.facturas = facturas;
       this.citaProductos = citaProductos;
    }
   
    public BigDecimal getCitaCita() {
        return this.citaCita;
    }
    
    public void setCitaCita(BigDecimal citaCita) {
        this.citaCita = citaCita;
    }
    public Date getCitaFecha() {
        return this.citaFecha;
    }
    
    public void setCitaFecha(Date citaFecha) {
        this.citaFecha = citaFecha;
    }
    public BigDecimal getCitaPaciente() {
        return this.citaPaciente;
    }
    
    public void setCitaPaciente(BigDecimal citaPaciente) {
        this.citaPaciente = citaPaciente;
    }
    public String getCitaObservacion() {
        return this.citaObservacion;
    }
    
    public void setCitaObservacion(String citaObservacion) {
        this.citaObservacion = citaObservacion;
    }
    public String getCitaTratamiento() {
        return this.citaTratamiento;
    }
    
    public void setCitaTratamiento(String citaTratamiento) {
        this.citaTratamiento = citaTratamiento;
    }
    public Date getCitaHora() {
        return this.citaHora;
    }
    
    public void setCitaHora(Date citaHora) {
        this.citaHora = citaHora;
    }
    public String getCitaEstado() {
        return this.citaEstado;
    }
    
    public void setCitaEstado(String citaEstado) {
        this.citaEstado = citaEstado;
    }
    public String getCitaMedico() {
        return this.citaMedico;
    }
    
    public void setCitaMedico(String citaMedico) {
        this.citaMedico = citaMedico;
    }
    public Date getCitaHoraconsulta() {
        return this.citaHoraconsulta;
    }
    
    public void setCitaHoraconsulta(Date citaHoraconsulta) {
        this.citaHoraconsulta = citaHoraconsulta;
    }
    public Set getTratamientos() {
        return this.tratamientos;
    }
    
    public void setTratamientos(Set tratamientos) {
        this.tratamientos = tratamientos;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }
    public Set getCitaProductos() {
        return this.citaProductos;
    }
    
    public void setCitaProductos(Set citaProductos) {
        this.citaProductos = citaProductos;
    }




}


