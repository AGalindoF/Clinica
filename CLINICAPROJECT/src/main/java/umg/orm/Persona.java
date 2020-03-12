package umg.orm;
// Generated 11/03/2020 11:12:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private PersonaId id;
     private Paciente paciente;
     private String perNombre;
     private String perApellido;
     private Date perFechaNacio;
     private BigDecimal perTelefono;
     private String perDireccion;
     private String perCorreo;
     private String perEstado;
     private String perLogin;
     private String perClave;
     private String perNit;
     private Set empleados = new HashSet(0);

    public Persona() {
    }

	
    public Persona(PersonaId id, Paciente paciente) {
        this.id = id;
        this.paciente = paciente;
    }
    public Persona(PersonaId id, Paciente paciente, String perNombre, String perApellido, Date perFechaNacio, BigDecimal perTelefono, String perDireccion, String perCorreo, String perEstado, String perLogin, String perClave, String perNit, Set empleados) {
       this.id = id;
       this.paciente = paciente;
       this.perNombre = perNombre;
       this.perApellido = perApellido;
       this.perFechaNacio = perFechaNacio;
       this.perTelefono = perTelefono;
       this.perDireccion = perDireccion;
       this.perCorreo = perCorreo;
       this.perEstado = perEstado;
       this.perLogin = perLogin;
       this.perClave = perClave;
       this.perNit = perNit;
       this.empleados = empleados;
    }
   
    public PersonaId getId() {
        return this.id;
    }
    
    public void setId(PersonaId id) {
        this.id = id;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getPerNombre() {
        return this.perNombre;
    }
    
    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }
    public String getPerApellido() {
        return this.perApellido;
    }
    
    public void setPerApellido(String perApellido) {
        this.perApellido = perApellido;
    }
    public Date getPerFechaNacio() {
        return this.perFechaNacio;
    }
    
    public void setPerFechaNacio(Date perFechaNacio) {
        this.perFechaNacio = perFechaNacio;
    }
    public BigDecimal getPerTelefono() {
        return this.perTelefono;
    }
    
    public void setPerTelefono(BigDecimal perTelefono) {
        this.perTelefono = perTelefono;
    }
    public String getPerDireccion() {
        return this.perDireccion;
    }
    
    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }
    public String getPerCorreo() {
        return this.perCorreo;
    }
    
    public void setPerCorreo(String perCorreo) {
        this.perCorreo = perCorreo;
    }
    public String getPerEstado() {
        return this.perEstado;
    }
    
    public void setPerEstado(String perEstado) {
        this.perEstado = perEstado;
    }
    public String getPerLogin() {
        return this.perLogin;
    }
    
    public void setPerLogin(String perLogin) {
        this.perLogin = perLogin;
    }
    public String getPerClave() {
        return this.perClave;
    }
    
    public void setPerClave(String perClave) {
        this.perClave = perClave;
    }
    public String getPerNit() {
        return this.perNit;
    }
    
    public void setPerNit(String perNit) {
        this.perNit = perNit;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }




}


