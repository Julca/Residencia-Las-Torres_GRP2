/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package residencia.modelo.dao;

import java.util.List;
import residencia.modelo.entidad.Habitacion;
import residencia.modelo.entidad.Habitaciondisponible;

/**
 *
 * @author ulises
 */
public interface habitaciondao {
    public List<Habitaciondisponible> listarhabitacionesdisponibles();//en habitaciondao
    public List<Habitacion> listarhabitacion();//en habitaciondao
    public List<Habitaciondisponible> listarpersonasporhabitacion(String idhabitacion);
}
