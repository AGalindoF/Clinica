package umg.orm;
// Generated 11/03/2020 11:12:06 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * CitaProductoId generated by hbm2java
 */
public class CitaProductoId  implements java.io.Serializable {


     private BigDecimal citpCitaproduc;
     private BigDecimal citaCitaCita;

    public CitaProductoId() {
    }

    public CitaProductoId(BigDecimal citpCitaproduc, BigDecimal citaCitaCita) {
       this.citpCitaproduc = citpCitaproduc;
       this.citaCitaCita = citaCitaCita;
    }
   
    public BigDecimal getCitpCitaproduc() {
        return this.citpCitaproduc;
    }
    
    public void setCitpCitaproduc(BigDecimal citpCitaproduc) {
        this.citpCitaproduc = citpCitaproduc;
    }
    public BigDecimal getCitaCitaCita() {
        return this.citaCitaCita;
    }
    
    public void setCitaCitaCita(BigDecimal citaCitaCita) {
        this.citaCitaCita = citaCitaCita;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CitaProductoId) ) return false;
		 CitaProductoId castOther = ( CitaProductoId ) other; 
         
		 return ( (this.getCitpCitaproduc()==castOther.getCitpCitaproduc()) || ( this.getCitpCitaproduc()!=null && castOther.getCitpCitaproduc()!=null && this.getCitpCitaproduc().equals(castOther.getCitpCitaproduc()) ) )
 && ( (this.getCitaCitaCita()==castOther.getCitaCitaCita()) || ( this.getCitaCitaCita()!=null && castOther.getCitaCitaCita()!=null && this.getCitaCitaCita().equals(castOther.getCitaCitaCita()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCitpCitaproduc() == null ? 0 : this.getCitpCitaproduc().hashCode() );
         result = 37 * result + ( getCitaCitaCita() == null ? 0 : this.getCitaCitaCita().hashCode() );
         return result;
   }   


}


