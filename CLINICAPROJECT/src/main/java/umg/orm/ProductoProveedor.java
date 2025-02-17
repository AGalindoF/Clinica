package umg.orm;
// Generated 11/03/2020 11:12:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * ProductoProveedor generated by hbm2java
 */
public class ProductoProveedor  implements java.io.Serializable {


     private ProductoProveedorId id;
     private Producto producto;
     private BigDecimal propProducto;
     private BigDecimal propProveedor;
     private Set proveedors = new HashSet(0);

    public ProductoProveedor() {
    }

	
    public ProductoProveedor(ProductoProveedorId id, Producto producto) {
        this.id = id;
        this.producto = producto;
    }
    public ProductoProveedor(ProductoProveedorId id, Producto producto, BigDecimal propProducto, BigDecimal propProveedor, Set proveedors) {
       this.id = id;
       this.producto = producto;
       this.propProducto = propProducto;
       this.propProveedor = propProveedor;
       this.proveedors = proveedors;
    }
   
    public ProductoProveedorId getId() {
        return this.id;
    }
    
    public void setId(ProductoProveedorId id) {
        this.id = id;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public BigDecimal getPropProducto() {
        return this.propProducto;
    }
    
    public void setPropProducto(BigDecimal propProducto) {
        this.propProducto = propProducto;
    }
    public BigDecimal getPropProveedor() {
        return this.propProveedor;
    }
    
    public void setPropProveedor(BigDecimal propProveedor) {
        this.propProveedor = propProveedor;
    }
    public Set getProveedors() {
        return this.proveedors;
    }
    
    public void setProveedors(Set proveedors) {
        this.proveedors = proveedors;
    }




}


