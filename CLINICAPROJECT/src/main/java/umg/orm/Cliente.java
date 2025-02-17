package umg.orm;
// Generated 11/03/2020 11:12:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private ClienteId id;
     private Factura factura;
     private String cliNit;
     private String cliNombre;
     private String cliDireccion;
     private BigDecimal cliTelefono;

    public Cliente() {
    }

	
    public Cliente(ClienteId id, Factura factura) {
        this.id = id;
        this.factura = factura;
    }
    public Cliente(ClienteId id, Factura factura, String cliNit, String cliNombre, String cliDireccion, BigDecimal cliTelefono) {
       this.id = id;
       this.factura = factura;
       this.cliNit = cliNit;
       this.cliNombre = cliNombre;
       this.cliDireccion = cliDireccion;
       this.cliTelefono = cliTelefono;
    }
   
    public ClienteId getId() {
        return this.id;
    }
    
    public void setId(ClienteId id) {
        this.id = id;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public String getCliNit() {
        return this.cliNit;
    }
    
    public void setCliNit(String cliNit) {
        this.cliNit = cliNit;
    }
    public String getCliNombre() {
        return this.cliNombre;
    }
    
    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }
    public String getCliDireccion() {
        return this.cliDireccion;
    }
    
    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }
    public BigDecimal getCliTelefono() {
        return this.cliTelefono;
    }
    
    public void setCliTelefono(BigDecimal cliTelefono) {
        this.cliTelefono = cliTelefono;
    }




}


