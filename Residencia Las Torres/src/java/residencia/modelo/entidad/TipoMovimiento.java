package residencia.modelo.entidad;
// Generated 21/05/2015 03:02:14 PM by Hibernate Tools 4.3.1



/**
 * TipoMovimiento generated by hbm2java
 */
public class TipoMovimiento  implements java.io.Serializable {


     private String idTipoMovimiento;
     private String nombre;

    public TipoMovimiento() {
    }

	
    public TipoMovimiento(String idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }
    public TipoMovimiento(String idTipoMovimiento, String nombre) {
       this.idTipoMovimiento = idTipoMovimiento;
       this.nombre = nombre;
    }
   
    public String getIdTipoMovimiento() {
        return this.idTipoMovimiento;
    }
    
    public void setIdTipoMovimiento(String idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

