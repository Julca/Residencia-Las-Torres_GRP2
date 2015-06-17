/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencia.modelo.dao;

import java.util.Date;
import java.util.List;
import residencia.modelo.entidad.Deudaporpersona;
import residencia.modelo.entidad.Distrito;
import residencia.modelo.entidad.Habitacion;
import residencia.modelo.entidad.Habitaciondisponible;
import residencia.modelo.entidad.Institucion;
import residencia.modelo.entidad.Mes;
import residencia.modelo.entidad.Ocupacion;
import residencia.modelo.entidad.Pais;
import residencia.modelo.entidad.Persona1;
import residencia.modelo.entidad.Personahospedada;
import residencia.modelo.entidad.Provincia;
import residencia.modelo.entidad.Region;
import residencia.modelo.entidad.Reporte_mensual;
import residencia.modelo.entidad.TipoMovimiento;
import residencia.modelo.entidad.Usuario;

/**
 *
 * @author ulises
 */
public interface residenciadao {
    public String validarusuario(String user,String password);
    public List<Pais> listarpais();
    public List<Region> listarregiones();
    public List<Provincia> listarprovincias(String id_region);
    public List<Distrito>listardistritos(String id_provincia);
    public List<Habitaciondisponible> listarhabitacionesdisponibles();
    public List<Persona1> buscarpersona(String dni);
    public boolean registrarpersona(Persona1 persona);
    public boolean actualizarpersona(Persona1 persona);
    public List<Personahospedada> listarpersonashospedadas();
    public List<Habitacion> listarhabitacion();
    public List<Ocupacion> listarocupacion();
    public List<Institucion> listarinstitucion();
    public boolean contrato(String precio,String idpersona,String finicio,String ffinal,
    String idhabitacion,String idusuario,String idocupacion,String idinstitucion,String idapoderado);
    public List<Mes> meses(String idpersona);
    public boolean insertardetallecontrato(String idpago,String idhabitacion,String precioactual,
    String finicio,String number1,String number2);
    
    public List<Reporte_mensual> listarReporte_mensual();
    public List<Deudaporpersona> listardeuda(String dni);
    public List<TipoMovimiento> listartipo_movimiento();
    public boolean registrarmovimiento(String idcontrato,String idtipomovimiento,String codigobaucher,
    String monto,String glosa );
    
    public List<Deudaporpersona> deudadelinquilino();
    public List<Deudaporpersona> elmasdudor();
    public List<Deudaporpersona> elmenosdeudor();
    public List<Persona1> buscarpersonasinprocedencia(String dni);

    public List<Persona1> deudadeunmes(String fecha);
    public List<Mes>  nombremes(String fecha);
    public boolean  registrarusuario(Usuario usuario);
    public String  dniexistente(String dni);
}

