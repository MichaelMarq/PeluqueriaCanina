package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controladora = new ControladoraPersistencia();

    public void guardarCliente(String nombre, String razaCliente, String colorCliente, String alergicoCliente, String atencionEspecial, String areaObservacion, String nombreDuenio, String telefonoDuenio) {

        //Creamos el dueño y le asignamos sus valores
        Duenio duenio = new Duenio();

        duenio.setNombre(nombreDuenio);
        duenio.setCelular(telefonoDuenio);

        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();

        masco.setNombre(nombre);
        masco.setRaza(razaCliente);
        masco.setColor(colorCliente);
        masco.setAlergico(alergicoCliente);
        masco.setAtencion_especial(atencionEspecial);
        masco.setObservaciones(areaObservacion);
        masco.setDuenio(duenio);

        controladora.guardar(duenio, masco);

    }

    public List<Duenio> traerDatosDuenio() {
        return controladora.traerDatosDuenio();
    }

    public List<Mascota> traerMascotas() {

        return controladora.traerDatosMascotas();
    }

    public void eliminarRegistro(int numCliente) {

        controladora.eliminarRegistro(numCliente);

    }

    public Mascota buscarMascota(int id) {

        return controladora.buscarMascota(id);
    }

    public void editarCliente(Mascota masco,String nombre, String razaCliente, String colorCliente, String alegicoCliente, String atencionEspecial, String areaObservacion, String nombreDuenio, String telefonoDuenio) {
       
        masco.setNombre(nombre);
        masco.setRaza(razaCliente);
        masco.setColor(colorCliente);
        masco.setAlergico(alegicoCliente);
        masco.setAtencion_especial(atencionEspecial);
        masco.setObservaciones(areaObservacion);
        
        Duenio due = new Duenio();
        
        due = traerDuenio(masco.getDuenio().getId_duenio());

        due.setNombre(nombreDuenio);
        due.setCelular(telefonoDuenio);
        
        modificarDuenio(due);
        controladora.editarCliente(masco);

    }
    
    private Duenio traerDuenio(int id){
        return controladora.traerDuenio(id);
    }
    
    private void modificarDuenio(Duenio due){
        controladora.modificarDuenio(due);
    }

}
